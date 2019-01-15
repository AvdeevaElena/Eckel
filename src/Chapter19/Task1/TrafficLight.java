package Chapter19.Task1;

import static Chapter19.Task1.Signal.GREEN;
import static Chapter19.Task1.Signal.RED;
import static Chapter19.Task1.Signal.YELLOW;


/*Exercise 1
// Use a static import to modify TrafficLight.java so you
// don't have to qualify the enum instances.*/

public class TrafficLight {
    Signal color = RED;
    public void change() {
        switch(color) {
            case RED:	color = GREEN;
                break;
            case GREEN: 	color = YELLOW;
                break;
            case YELLOW:	color = RED;
                break;
        }
    }
    public String toString() {
        return "The traffic light is " + color;
    }
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for(int i = 0; i < 7; i++) {
            System.out.println(t);
            t.change();
        }
    }
}
