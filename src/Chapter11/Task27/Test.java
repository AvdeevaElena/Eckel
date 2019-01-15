package Chapter11.Task27;

import java.util.Queue;

/* Exercise 27
/* Write a class called Command that contains a String and has a method operation()
* that displays the String. Write a second class with a method that fills a Queue
* with Command objects and returns it. Pass the filled Queue to a method in a third
* class that consumes the objects in the Queue and calls their operation() methods.*/

public class Test {

    void  testPrint (Queue<Command> testQueue){

        while (!testQueue.isEmpty()) {
            System.out.println( testQueue.element().strValue);
            System.out.println( testQueue.poll());
        }

    }



    public static void main(String[] args) {
        Command c1 = new Command();
        c1.strValue = "c1_abc";
        Command c2 = new Command();
        c2.strValue = "c2_abc";
        Command c3 = new Command();
        c3.strValue = "c3_abc";
        Command c4 = new Command();
        c4.strValue = "c4_abc";
        CommandQueue cq = new CommandQueue();
        Queue<Command> testQC = cq.printComQ(c1,c2,c3,c4);

        Test test = new Test();
        test.testPrint(testQC);
    }
}
