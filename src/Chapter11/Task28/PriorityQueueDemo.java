package Chapter11.Task28;

import java.util.PriorityQueue;
import java.util.Random;


/*Exercise 28
/* Fill a PriorityQueue (using offer()) with Double values created using
* java.util.Random, then remove the elements using poll() and display them.*/

public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        Random rand = new Random();
        for (int i = 0; i<10; i++) {
            priorityQueue.offer((int) (rand.nextDouble() * i));
        }

       while(!priorityQueue.isEmpty() ) {
           System.out.println(priorityQueue.poll());
       };
    }

}
