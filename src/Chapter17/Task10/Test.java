package Chapter17.Task10;

/* Exercise 10
// Using a LinkedList as your underlying implementation,
// define your own SortedSet.*/

public class Test {
    public static void main(String[] args) {
        SortedSet<T> ss = new SortedSet<T>();
        ss.add(new T());
        ss.add(new T());
        ss.add(new T());
        ss.add(new T());
        System.out.println(ss);
        SortedSet<Integer> ss2 = new SortedSet<Integer>();
        ss2.add(6);
        ss2.add(8);
        ss2.add(2);
        ss2.add(4);
        ss2.add(2);
        ss2.add(8);
        System.out.println(ss2);
        SortedSet<String> ss3 = new SortedSet<String>();
        ss3.add("three");
        ss3.add("three");
        ss3.add("seven");
        ss3.add("hi");
        ss3.add("two");
        ss3.add("one");
        System.out.println(ss3);
    }
}
