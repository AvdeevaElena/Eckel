package Chapter11.Task15;

import java.util.LinkedList;


/*Exercise 15: Stacks are often used to evaluate expressions in programming languages. Using net.mindview.util.Stack,
 * evaluate the following expression, where’+’ means "push the following letter onto the stack," and’-’ means "pop the
 * top of the stack and print it": "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"*/

public class Stack<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    public Stack() {
    }

    public void push(T item) {
        linkedList.addFirst(item);
    }

    public T pop() {
        return linkedList.removeFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}