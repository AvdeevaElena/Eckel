package Chapter17.Task11;

import java.util.PriorityQueue;


/*Exercise 11
/* Create a class that contains an Integer that is initialized
* to a value between 0 and 100 using java.util.Random. Implement
* Comparable using this Integer field. Fill a PriorityQueue with
* objects of your class, and extract the values using poll() to
* show that it produces the expected order.
*/

public class Test {
    public static void main(String[] args) {
        PriorityQueue<HaveInt> pq = new PriorityQueue<HaveInt>();
        for(int i = 0; i < 10; i++) {
            pq.add(new HaveInt());
        }
        int size = pq.size();
        for(int i = 0; i < size; i++) {
            System.out.print(pq.poll() + " ");
        }
    }
}
