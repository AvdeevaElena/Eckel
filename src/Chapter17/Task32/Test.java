package Chapter17.Task32;
/*Exercise 32, page 871
/* Repeat the previous exercise for a container of int, and compare the
* performance to an ArrayList<Integer>. In your performance comparison,
* include the process of incrementing each object in the container.*/


import java.util.*;
public class Test {
    static long addTimeTest(IntegerHolder ih, int reps) {
        long start = System.nanoTime();
        for(int i = 0; i < reps; i++) ih.add(1);
        long stop = System.nanoTime();
        return (stop - start)/reps;
    }
    static long addTimeTest(ArrayList<Integer> list, int reps) {
        long start = System.nanoTime();
        for(int i = 0; i < reps; i++) list.add(1);
        long stop = System.nanoTime();
        return (stop - start)/reps;
    }
    static long getTimeTest(IntegerHolder ih, int reps) {
        long start = System.nanoTime();
        for(int i = 0; i < reps; i++) ih.get(i);
        long stop = System.nanoTime();
        return (stop - start)/reps;
    }
    static long getTimeTest(ArrayList<Integer> list, int reps) {
        long start = System.nanoTime();
        for(int i = 0; i < reps; i++) list.get(i);
        long stop = System.nanoTime();
        return (stop - start)/reps;
    }
    static long addTimeTest(IntegerHolder2 ih, int reps) {
        long start = System.nanoTime();
        for(int i = 0; i < reps; i++) ih.add(1);
        long stop = System.nanoTime();
        return (stop - start)/reps;
    }
    static long getTimeTest(IntegerHolder2 ih, int reps) {
        long start = System.nanoTime();
        for(int i = 0; i < reps; i++) ih.get(i);
        long stop = System.nanoTime();
        return (stop - start)/reps;
    }
    static long incrementTimeTest(IntegerHolder ih) {
        long start = System.nanoTime();
        ih.incrementAll();
        long stop = System.nanoTime();
        return (stop - start)/ih.size();
    }
    static long incrementTimeTest(ArrayList<Integer> list) {
        long start = System.nanoTime();
        for(Integer i : list) i++;
        long stop = System.nanoTime();
        return (stop - start)/list.size();
    }
    static long incrementTimeTest(IntegerHolder2 ih) {
        long start = System.nanoTime();
        ih.incrementAll();
        long stop = System.nanoTime();
        return (stop - start)/ih.size();
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        IntegerHolder ih = new IntegerHolder();
        System.out.println("Add times (nanoseconds):");
        System.out.println("Mean of 1000:");
        System.out.println("ArrayList add(): " + addTimeTest(list, 1000));
        System.out.println("IntsHolder add(): " + addTimeTest(ih, 1000));
        System.out.println("Mean of 10000:");
        System.out.println("ArrayList add(): " + addTimeTest(list, 10000));
        System.out.println("IntsHolder add(): " + addTimeTest(ih, 10000));

        System.out.println("Get times (nanoseconds):");
        System.out.println("Mean of 10000:");
        System.out.println("ArrayList get(): " + getTimeTest(list, 10000));
        System.out.println("IntsHolder get(): " + getTimeTest(ih, 10000));
        System.out.println("Using alternate fixed size (1000) StringsHolder2");
        System.out.println("eliminates resizing and copying:");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        IntegerHolder2 ih2 = new IntegerHolder2();
        System.out.println("Add times (nanoseconds):");
        System.out.println("Mean of 1000:");
        System.out.println("ArrayList add(): " + addTimeTest(list2, 1000));
        System.out.println("IntsHolder2 add(): " + addTimeTest(ih2, 1000));

        System.out.println("Get times (nanoseconds):");
        System.out.println("Mean of 1000:");
        System.out.println("ArrayList get(): " + getTimeTest(list2, 1000));
        System.out.println("IntsHolder2 get(): " + getTimeTest(ih2, 1000));

        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for(int i = 0; i < 1000; i++) list3.add(1);
        IntegerHolder ih3 = new IntegerHolder();
        for(int i = 0; i < 1000; i++) ih3.add(1);
        IntegerHolder2 ih4 = new IntegerHolder2();
        for(int i = 0; i < 1000; i++) ih4.add(1);
        System.out.println("Increment times (1000 elements):");
        System.out.println("ArrayList: " + incrementTimeTest(list3));
        System.out.println("IntsHolder: " + incrementTimeTest(ih3));
        System.out.println("intsHolder2: " + incrementTimeTest(ih4));
    }
}

