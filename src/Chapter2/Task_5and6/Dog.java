package Chapter2.Task_5and6;

        /*Exercise 5: (2) Create a class called Dog containing two Strings: name and says. In main( ),
        create two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”).
        Then display their names and what they say.
        Exercise 6: (3) Following Exercise 5, create a new Dog reference and assign it to spot’s object.
        Test for comparison using == and equals( ) for all references.v */

public class Dog {
 String name;
 String says;

 Dog(String name,String says) {
     this.name=name;
     this.says=says;
 }
 void printNameAndVoice(){
     System.out.println(this.name + " "+ this.says);
 };

}
