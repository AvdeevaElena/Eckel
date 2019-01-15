package Chapter9.Task19_FabricMethod.Kubic_Coins;

import java.util.Random;

public class Kubic implements Game{

    String one = "one";
    String two = "two";
    String tree = "tree";
    String four = "four";
    String five = "five";
    String six = "six";

    private int step=0;
    private static final int STEPS = 4;

    public boolean throwen() {

        Random random = new Random();
        int res = 0;
        do{
            ++step;
            res = random.ints(1,0,7).findFirst().getAsInt();

            switch (res) {
                case 1: System.out.println("Kubic it's a " + one+ "!!!"); continue;
                case 2: System.out.println("Kubic it's a " + two+ "!!!"); continue;
                case 3: System.out.println("Kubic it's a " + tree+ "!!!"); continue;
                case 4: System.out.println("Kubic it's a " + four+ "!!!"); continue;
                case 5: System.out.println("Kubic it's a " + five+ "!!!"); continue;
                case 6: System.out.println("Kubic it's a " + six+ "!!!"); continue;
            }
        } while (step !=STEPS);

        return step !=STEPS;
    }
}
