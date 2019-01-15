package Chapter11.Task7;

/* Exercise 8: Modify Exercise 1 so it uses an Iterator to move through the List while calling hop( ).*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal [] arrAnimal = new Animal[7];
        arrAnimal[0] = new Animal("Cat");
        arrAnimal[1] = new Animal("Lion");
        arrAnimal[2] = new Animal("Tiger");
        arrAnimal[3] = new Animal("Monkey");
        arrAnimal[4] = new Animal("Elephant");
        arrAnimal[5] = new Animal("Snake");
        arrAnimal[6] = new Animal("Bear");

       List<Animal> listAnimal = new ArrayList<Animal>();
       Collections.addAll(listAnimal, arrAnimal);

        for(Animal animal: listAnimal) {
           System.out.println( animal.name);
        }

        System.out.println("subList");
        List<Animal> listAnimalSub =  listAnimal.subList(0, 3);

        for(Animal animal: listAnimalSub) {
            System.out.println( animal.name);
        }

        System.out.println("clear");
        listAnimal.subList(0, 3).clear();

        for(Animal animal: listAnimal) {
            System.out.println( animal.name);
        }



    }
}
