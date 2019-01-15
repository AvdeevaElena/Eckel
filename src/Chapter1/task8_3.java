package Chapter1;

/* Exercise 8: (3) Write a program that demonstrates that, no matter how many objects you create of a particular class,
 there is only one instance of a particular static field in that class. */

public class task8_3 {

    static int i;
    int y;

    public static void main(String[] args) {

    for (int i=0; i<10; i++) {
        task8_3.i ++;
    }
        System.out.println(task8_3.i);

        task8_3 obj = new  task8_3();
        System.out.println(obj.y);
        obj.y = 27;
        System.out.println(obj.y);
        obj.i +=22;
        System.out.println(obj.i);

        task8_3 obj2 = new  task8_3();
        System.out.println(obj2.y);
        obj2.y = 227;
        System.out.println(obj2.y);
        obj2.i +=1;
        System.out.println(obj2.i);
    }
}
