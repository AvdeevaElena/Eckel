package Chapter19.Task10;


/*/VendingMachine10.java
// {Arg: VendingMachine10aInput.txt}
// TIJ4 Chapter Enumerated, Exercise 10, page 1047
// Modify class VendingMachine (only) using EnumMap so that one
// program can have multiple instances of VendingMachine*/

import Chapter16.Task12.Generator;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

public class VendingMachine {
    int id = ++count;
    static int count = 0;
    State state = State.RESTING;
    int amount = 0; // for each transaction
    int banked = 0; // retained after transactions
    Input input = null;
    Input selection = null;
    boolean isTransient = false;
    // Enums must be static, sot use classes instead:
    class RestingDo implements Command {
        public void next(Input in) {
            isTransient = false;
            input = in;
            switch(Category.categorize(in)) {
                case MONEY:
                    amount += in.amount();
                    state = State.ADDING_MONEY;
                    break;
                case SHUT_DOWN:
                    state = State.TERMINAL;
                default:
            }
        }
        public void next() {
            isTransient = false;
        }
    }
    class AddingMoneyDo implements Command {
        public void next(Input input) {
            isTransient = false;
            switch(Category.categorize(input)) {
                case MONEY:
                    amount += input.amount();
                    break;
                case ITEM_SELECTION:
                    selection = input;
                    if(amount < selection.amount()) {
                        System.out.println("Insufficient money for " + selection);							}
                    else {
                        state = State.DISPENSING;
                        isTransient = true;
                    }
                    break;
                case QUIT_TRANSACTION:
                    state = State.GIVING_CHANGE;
                    isTransient = true;
                    break;
                case SHUT_DOWN:
                    state = State.TERMINAL;
                    banked = banked += amount;
                default:
            }
        }
        public void next() { isTransient = false; }
    }
    class DispensingDo implements Command {
        public void next() {
            isTransient = true;
            System.out.println("Here is your " + selection);
            state = State.GIVING_CHANGE;
        }
        public void next(Input input) {
            isTransient = true;
            System.out.println("Here is your " + selection);
            state = State.GIVING_CHANGE;
        }
    }
    class GivingChangeDo implements Command {
        public void next(Input input) {
            isTransient = true;
            if(amount > selection.amount()) {
                System.out.println("Your change: " + (amount - selection.amount()));
            }
            banked = banked += selection.amount();
            amount = 0; // reset
            state = State.RESTING;
        }
        public void next() {
            isTransient = true;
            if(amount < selection.amount())
                System.out.println("Returning your: " + amount);
            if(amount > selection.amount()) {
                System.out.println("Your change: " + (amount - selection.amount()));
                banked = banked += selection.amount();
            }
            if(amount == selection.amount())
                banked = banked += selection.amount();
            amount = 0;
            state = State.RESTING;
        }
    }
    class TerminalDo implements Command {
        public void next(Input input) {
            System.out.println("state TERMINAL");
            isTransient = false;
        }
        public void next() {
            System.out.println("state TERMINAL");
            isTransient = false;
        }
    }
    Map<State,Command> em = Collections.synchronizedMap(new EnumMap<State,Command>(State.class));
    VendingMachine() { // Load up the EnumMap in the constructor
        System.out.println("VendingMachine10()#" + id);
        em.put(State.RESTING, new RestingDo());
        em.put(State.ADDING_MONEY, new AddingMoneyDo());
        em.put(State.DISPENSING, new DispensingDo());
        em.put(State.GIVING_CHANGE, new GivingChangeDo());
        em.put(State.TERMINAL, new TerminalDo());
    }
    void showAmount() { System.out.println("amount = " + amount); }
    void showBanked() { System.out.println("banked = " + banked); }
    public static void main(String[] args) {

        Generator<Input> gen = new RandomInputGenerator();
        if(args.length == 1)
            gen = new FileInputGenerator(args[0]);
        VendingMachine vm10a = new VendingMachine();
        VendingMachine vm10b = new VendingMachine();
        VendingMachine vm10c = new VendingMachine();
        System.out.println();
        System.out.println("Testing VendingMachine 10a:");
        while(vm10a.state != State.TERMINAL) {
            Input in = gen.next();
            (vm10a.em.get(vm10a.state)).next(in);
            while(vm10a.isTransient) {
                (vm10a.em.get(vm10a.state)).next();
            }
            vm10a.showAmount();
        }
        vm10a.showBanked();
        System.out.println();
        System.out.println("Testing VendingMachine 10b:");
        gen = new FileInputGenerator("VendingMachine10bInput.txt");
        while(vm10b.state != State.TERMINAL) {
            Input in = gen.next();
            (vm10b.em.get(vm10b.state)).next(in);
            while(vm10b.isTransient) {
                (vm10b.em.get(vm10b.state)).next();
            }
            vm10b.showAmount();
        }
        System.out.println();
        System.out.println("Testing VendingMachine 10c:");
        gen = new FileInputGenerator("VendingMachine10cInput.txt");
        while(vm10c.state != State.TERMINAL) {
            Input in = gen.next();
            (vm10c.em.get(vm10c.state)).next(in);
            while(vm10c.isTransient) {
                (vm10c.em.get(vm10c.state)).next();
            }
            vm10c.showAmount();
        }
    }
}
