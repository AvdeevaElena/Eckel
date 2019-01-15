package Chapter5;


        //Exercise 4: (1) Add an overloaded constructor to the previous
        //exercise that takes a String argument and prints it along with your message.
public class Task4 {

           String name;

            Task4(){

                System.out.println("Я конструктор о умолчанию");
            }


            Task4(String name){
                this.name =name;

                System.out.println("Я конструктор c параметрами");
            }

            public static void main(String[] args) {

                Task4 test = new Task4("Sasha");
                System.out.println(test.name);

            }
}