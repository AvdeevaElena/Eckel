package Chapter5;
/*Exercise 17: (2) Create a class with a constructor that takes a String argument. During construction,
print the argument. Create an array of object references to this class, but don’t actually create objects to assign into
 the array.
 When you run the program, notice whether the initialization messages from the constructor calls are printed.*/

public class Task17andTask18 {

   // String name;
    Task17andTask18(String name){
        name = "Konst";
        System.out.println(name);

    }

    public static void main(String[] args) {

        Task17andTask18 test = new Task17andTask18("Something");

        System.out.println(test);
        Task17andTask18[]arrTest = new Task17andTask18[2];

        for(int i =0; i<arrTest.length; i++){

            System.out.println(arrTest[i]);
        }

        System.out.println("Outer 18");

        for(int i =0; i<arrTest.length; i++){

            arrTest[i] = new Task17andTask18("SomeThing");
            System.out.println(arrTest[i]);
        }




    }
}
