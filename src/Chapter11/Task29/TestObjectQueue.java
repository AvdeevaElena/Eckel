package Chapter11.Task29;

import java.util.PriorityQueue;

/*Chapter Holding, Exercise 29, page 427
/* Fill a PriorityQueue (using offer()) with Double values created using
* java.util.Random, then remove the elements using poll() and display them.*/

public class TestObjectQueue extends Object{

    public static void main(String[] args) {
        TestObjectQueue obj1 = new TestObjectQueue();
        TestObjectQueue obj2 = new TestObjectQueue();
        TestObjectQueue obj3 = new TestObjectQueue();

        PriorityQueue<TestObjectQueue>  testPQO= new PriorityQueue<TestObjectQueue>();
        testPQO.offer(obj1);
        testPQO.offer(obj2);
        testPQO.offer(obj3);
        testPQO.offer(new TestObjectQueue());

        /*Exception in thread "main" java.lang.ClassCastException: Chapter11.Task29.TestObjectQueue cannot be cast to java.base/java.lang.Comparable
         */

    }
}
