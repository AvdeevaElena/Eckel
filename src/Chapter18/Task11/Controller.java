package Chapter18.Task11;

import java.util.Iterator;
import java.util.LinkedList;

/*Exercise 13: In the innerclasses/GreenhouseController.java example, the class Controller uses an ArrayList. Change
 * the code to use a LinkedList instead, and use an Iterator to cycle through the set of events.*/


public class Controller{

    private LinkedList<Event> eventList = new LinkedList<>();

    public void addEvent(Event c) { eventList.add(c); }
    public void run() {
        while(eventList.size() > 0){
            Event event;
            Iterator<Event> it = new LinkedList<>(eventList).iterator();
            while (it.hasNext()) {
                event = it.next();
                if (event.ready()){
                    event.action();
                    eventList.remove(event);
                }

             }

        }
    }

}
