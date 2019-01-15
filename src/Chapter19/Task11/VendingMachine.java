package Chapter19.Task11;

/* Exercise 11
/* In a real vending machine you will want to easily add and change
* the type of vended items, so the limits imposed by an enum on
* Input are impractical (remember that enums are for a restricted set
* of types). Modify VendingMachine.java so that the vended items are
* represented by a class instead of being part of Input, and initialize
* an ArrayList of these objects from a text file
* (using net.mindview.util.TextFile).*/

import Chapter16.Task12.Generator;

import java.io.IOException;

public class VendingMachine {
    private static State state = State.RESTING;
    private static int amount = 0;
    private static VendedItem selection = null;
    enum StateDuration { TRANSIENT } // Tagging enum
    enum State {
        RESTING {
            void next(VendingInput in) {
                if(MonetaryUnit.class.isInstance(in)) {
                    amount += ((MonetaryUnit)in).amount();
                    state = ADDING_MONEY;
                }
                if(VendingEvent.class.isInstance(in)) {
                    if(((VendingEvent)in).name().equals("Stop"))
                        state = TERMINAL;
                }
            }
        },
        ADDING_MONEY {
            void next(VendingInput in) {
                if(MonetaryUnit.class.isInstance(in)) {
                    amount += ((MonetaryUnit)in).amount();
                }
                if(VendedItem.class.isInstance(in)) {
                    selection = (VendedItem)in;
                    if(amount < selection.price())
                        System.out.println("Insufficient money for " + selection.name());
                    else state = DISPENSING;
                }
                if(VendingEvent.class.isInstance(in)) {
                    if(((VendingEvent)in).name().equals("AbortTransaction"))
                        state = GIVING_CHANGE;
                    if(((VendingEvent)in).name().equals("Stop"))
                        state = TERMINAL;
                }
            }
        },
        DISPENSING(StateDuration.TRANSIENT) {
            void next() {
                System.out.println("here is your " + selection.name());
                amount -= selection.price();
                state = GIVING_CHANGE;
            }
        },
        GIVING_CHANGE(StateDuration.TRANSIENT) {
            void next() {
                if(amount > 0) {
                    System.out.println("Your change: " + amount);
                    amount = 0;
                }
                state = RESTING;
            }
        },
        TERMINAL { void output() { System.out.println("Halted"); } };
        private boolean isTransient = false;
        State()	{} // no-arg constructor
        State(StateDuration trans) { isTransient = true; }
        void next(VendingInput in) {
            throw new RuntimeException("Only call " +
                    "next(VendingInput in) for non-transient states");
        }
        void next() {
            throw new RuntimeException("Only call next() for " +
                    "StateDuration.TRANSIENT states");
        }
        void output() { System.out.println(amount); }
    }
    static void run(Generator<VendingInput> gen) {
        while(state != State.TERMINAL) {
            state.next(((FileInputGenerator)gen).next());
            while(state.isTransient)
                state.next();
            state.output();
        }
        state = State.RESTING;
        System.out.println();
    }
    static void runRandom(Generator<VendingInput> gen) {
        while(state != State.TERMINAL) {
            state.next(((FileInputGenerator)gen).randomNext());
            while(state.isTransient)
                state.next();
            state.output();
        }
        state = State.RESTING;
        System.out.println();
    }
    static void runTextExample(Generator<VendingInput> gen) {
        while(state != State.TERMINAL) {
            // for(int i = 0; i < 16; i++) {
            state.next(((FileInputGenerator)gen).textExampleNext("VendingMachineInput.txt"));
            while(state.isTransient)
                state.next();
            state.output();
        }
        state = State.RESTING;
        System.out.println();
    }
    public static void main(String[] args) throws IOException {
        FileInputGenerator gen = new FileInputGenerator("VendingMachine11Input.txt");
        runRandom(gen); // random vending inputs
        run(gen);
        runTextExample(gen); // inputs from VendingMachineInput.txt
    }
}
