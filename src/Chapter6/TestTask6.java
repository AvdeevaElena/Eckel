package Chapter6;

public class TestTask6 {

    Task6 task6 = new Task6();

    void printValTask6() {
        System.out.println("PROTECTED");
        System.out.println(task6.doubleValProt);
        System.out.println(task6.intValProt);
    }

    public static void main(String[] args) {

        TestTask6  test = new TestTask6();
        test.printValTask6();


    }
}
