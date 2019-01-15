package Chapter18.Task22;


/*Exercise 22
/* Modify OSExecute.java so that, instead of printing the standard output stream,
* it returns the results of executing the program as a List of Strings. Demonstrate
* the use of this new version fo the utility.*/

public class Test {

        public static void main(String[] args) throws OSExecuteException {
            for(String s : OSExecute.command("javap OSExecute22Test"))
                System.out.println(s);
        }
}
