package Chapter10.Task20;
//Implement reverseSelector( ) in Sequence.java.
public class Test {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(5);
        for(int i = 0; i < 5; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
