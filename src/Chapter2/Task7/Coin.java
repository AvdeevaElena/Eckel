package Chapter2.Task7;

import java.util.Random;

public class Coin {
    String heads = "Heads";
    String tails = "Tails";


 void throwCoin(){

     Random random = new Random();
     int res = random.nextInt(100)+1;
     if (res%2 == 0) {
             System.out.println("it's a " + heads + "!!!");
     }
     else    System.out.println("it's a " + tails + "!!!");
    }
}

