package Chapter9.Task19_FabricMethod.Kubic_Coins;

import java.util.Random;

public class Coins  implements Game {


    String heads = "Heads";
    String tails = "Tails";

    private int step=0;
    private static final int STEPS = 4;


    public boolean throwen() {

        Random random = new Random();
        int res;
        do{
            ++step;
            res = random.nextInt(100) + 1;
        if (res % 2 == 0) {
            System.out.println("Coins it's a " + heads + "!!!");
        } else System.out.println("Coins it's a " + tails + "!!!");

    } while (step !=STEPS);

        return step !=STEPS;
    }
}

