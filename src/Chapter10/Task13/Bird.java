package Chapter10.Task13;

/*Exercise 15: Create a class with a non-default constructor (one with arguments) and no default
  constructor (no "no-arg" constructor).
 * Create a second class that has a method that returns a reference to an object of the first class.
 * Create the object that you return by making an anonymous inner class that inherits from the first class.*/

public class Bird {

    Animal returnRef(){
        return new Animal(99){
        };
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println(bird.returnRef().value);
    }
}
