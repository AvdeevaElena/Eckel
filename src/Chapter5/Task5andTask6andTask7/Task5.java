package Chapter5.Task5andTask6andTask7;

public class Task5 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark(1);
        dog.bark('1');
        dog.bark("str");

        dog.bark(1,'1');
        dog.bark('1',1);

        System.out.println(dog);

    }
}
