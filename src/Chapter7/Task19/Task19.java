package Chapter7.Task19;

public class Task19 {
    final int i;

    Task19() {this.i = 120;};
    Task19(int b){i =b; };

    public static void main(String[] args) {
        Task19 obj1 = new Task19(33);
        //obj1.i =4;
        Task19 obj2 = new Task19();
        System.out.println(obj2.i);
    }
}
