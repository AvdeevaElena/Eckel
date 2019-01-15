package Chapter11.Task15;
/*Exercise 15: Stacks are often used to evaluate expressions in programming languages. Using net.mindview.util.Stack,
 * evaluate the following expression, where’+’ means "push the following letter onto the stack," and’-’ means "pop the
 * top of the stack and print it": "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"*/

public class Test {
    public static void main(String[] args) {
        String[] strings = "+U+n+c-+e+r+t-+a-+i-+n+t+y-+ -+r+u-+l+e+s-".split("");

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("+")) {
                stack.push(strings[i + 1]);
            } else if (strings[i].equals("-")) {
                System.out.print(stack.pop() + " ");
            }
        }
        System.out.println(stack);
    }
}
