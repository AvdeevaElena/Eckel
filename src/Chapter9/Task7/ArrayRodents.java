package Chapter9.Task7;

/*
Exercise 7: (1) Change Exercise 9 in the Polymorphism chapter so that Rodent is an interface.Exercise 7: (1)
Change Exercise 9 in the Polymorphism chapter so that Rodent is an interface.
*/
public class ArrayRodents {

    public static void main(String[] args) {

        Rodent[] rodents = {new Mouse(), new Hamster(), new Mouse(), new Hamster()};

        for (Rodent i: rodents) { i.run(); i.voice();};
    }
}
