package Chapter8.Task5;

public class Cycle {

     int wheel;

    @Override
    public String toString() {
        return "Cycle";
    }

    void ride (Cycle c){

        System.out.println("RIDE " + c + " "+ c.wheels(c));
    }

     int wheels (Cycle c){

        if (c.toString() =="Bicycle") wheel = 2;
        else if (c.toString() == "Tricycle") wheel=3;
        else if (c.toString() == "Unicycle") wheel=4;
        else wheel =0;
        return wheel;

    }
}
