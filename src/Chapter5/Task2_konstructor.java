package Chapter5;

public class Task2_konstructor {

    String name;
    Task2_konstructor(){
        name = "Maria";
    }

    public static void main(String[] args) {

        Task2_konstructor test = new Task2_konstructor();
        System.out.println(test.name);

    }
}
