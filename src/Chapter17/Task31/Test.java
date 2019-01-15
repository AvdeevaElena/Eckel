package Chapter17.Task31;

import java.util.ArrayList;

/*Exercise 31
/* Create a container that encapsulates an array of String, and only
* allows adding Strings and getting Strings, so that there are no
* casting issues during use. If the internal array isn't big enough
* for the next add, your container should automatically resize it.
* In main(), compare the performance of your container with an
* ArrayList<String>.*/

public class Test {
    static long addTimeTest(StringsHolder sh, int reps) {
        long start = System.nanoTime();
        for(int i = 0; i < reps; i++) sh.add("hi");
        long stop = System.nanoTime();
        return (stop - start)/reps;
    }
    static long addTimeTest(ArrayList<String> list, int reps) {
        long start = System.nanoTime();
        for(int i = 0; i < reps; i++) list.add("hi");
        long stop = System.nanoTime();
        return (stop - start)/reps;
    }
    static long getTimeTest(StringsHolder sh, int reps) {
        long start = System.nanoTime();
        for(int i = 0; i < reps; i++) sh.get(i);
        long stop = System.nanoTime();
        return (stop - start)/reps;
    }
    static long getTimeTest(ArrayList<String> list, int reps) {
        long start = System.nanoTime();
        for(int i = 0; i < reps; i++) list.get(i);
        long stop = System.nanoTime();
        return (stop - start)/reps;
    }
    static long addTimeTest(StringsHolder2 sh, int reps) {
        long start = System.nanoTime();
        for(int i = 0; i < reps; i++) sh.add("hi");
        long stop = System.nanoTime();
        return (stop - start)/reps;
    }
    static long getTimeTest(StringsHolder2 sh, int reps) {
        long start = System.nanoTime();
        for(int i = 0; i < reps; i++) sh.get(i);
        long stop = System.nanoTime();
        return (stop - start)/reps;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        StringsHolder sh = new StringsHolder();
        System.out.println("Add times (nanoseconds):");
        System.out.println("Mean of 1000:");
        System.out.println("ArrayList add(): " + addTimeTest(list, 1000));
        System.out.println("StringsHolder add(): " + addTimeTest(sh, 1000));
        System.out.println("Mean of 10000:");
        System.out.println("ArrayList add(): " + addTimeTest(list, 10000));
        System.out.println("StringsHolder add(): " + addTimeTest(sh, 10000));

        System.out.println("Get times (nanoseconds):");
        System.out.println("Mean of 10000:");
        System.out.println("ArrayList get(): " + getTimeTest(list, 10000));
        System.out.println("StringsHolder get(): " + getTimeTest(sh, 10000));
        System.out.println();
        System.out.println("Using alternate fixed size (1000) StringsHolder2");
        System.out.println("eliminates resizing and copying:");
        ArrayList<String> list2 = new ArrayList<String>();
        StringsHolder2 sh2 = new StringsHolder2();
        System.out.println("Add times (nanoseconds):");
        System.out.println("Mean of 1000:");
        System.out.println("ArrayList add(): " + addTimeTest(list2, 1000));
        System.out.println("StringsHolder2 add(): " + addTimeTest(sh2, 1000));

        System.out.println("Get times (nanoseconds):");
        System.out.println("Mean of 1000:");
        System.out.println("ArrayList get(): " + getTimeTest(list2, 1000));
        System.out.println("StringsHolder2 get(): " + getTimeTest(sh2, 1000));
    }
}
