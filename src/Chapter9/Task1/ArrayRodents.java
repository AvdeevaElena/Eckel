package Chapter9.Task1;
/*
Exercise 1: (1) Modify Exercise 9 in the previous chapter so that Rodent is an abstract class. Make the methods
of Rodent abstract whenever possible. */

public class ArrayRodents {

    public static void main(String[] args) {

        Rodent[] rodents = {new Mouse(), new Hamster(), new Mouse(), new Hamster()};

        for (Rodent i: rodents) { i.run(); i.voice();};
    }
}
