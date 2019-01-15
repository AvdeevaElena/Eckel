package Chapter1;

/*Exercise 10: (2) Write a program that prints three arguments taken from the command line.
        To do this, you’ll need to index into the command-line array of Strings.*/

public class task10_2 {
    public static void main(String[] args) {
        String [] str = {"something","any","something","any","something","any"};
        printP (str);

    }

    public static void printP (String[] str) {

        for(int i =0; i<3; i++){
            System.out.println(str[i]+" "+i);
        }
    }
}
