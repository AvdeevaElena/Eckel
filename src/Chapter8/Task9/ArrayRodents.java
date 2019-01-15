package Chapter8.Task9;
/*
Exercise 9: (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc.
 In the base class, provide methods that are common to all Rodents, and override these in the derived classes
 to perform different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill
 it with different specific types of Rodents, and call your base-class methods to see what happens.
*/
public class ArrayRodents {

    public static void main(String[] args) {

        Rodent [] rodents = {new Mouse(), new Hamster(), new Mouse(), new Hamster()};

        for (Rodent i: rodents) { i.run(); i.voice();};
    }
}
