package Chapter10.Task22ANDTask23;

public class GreenhouseControls extends Controller {
    public class Bell extends Event {
        public Bell(long delayTime) { super(delayTime); }
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString() { return "Bing!"; }
    }
    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for(Event e : eventList)
                addEvent(e);
        }
        public void action() {
            for(Event e : eventList) {
                e.start(); // Rerun each event
                addEvent(e);
            }
            start(); // Rerun this Event
            addEvent(this);
        }
        public String toString() {
            return "Restarting system";
        }
    }
    public static class Terminate extends Event {
        public Terminate(long delayTime) { super(delayTime); }
        public void action() { System.exit(0); }
        public String toString() { return "Terminating"; }
    }
    //-------------------- Start of Exercise24 code
    private boolean fans = false;
    public class FansOn extends Event {
        public FansOn(long delayTime) { super(delayTime); }
        public void action() {
            // Put hardware control code here to
            // physically turn on the fans.
            fans = true;
        }
        public String toString() { return "Fans are on"; }
    }
    public class FansOff extends Event {
        public FansOff(long delayTime) { super(delayTime); }
        public void action() {
            // Put hardware control code here to
            // physically turn off the fans.
            fans = false;
        }
        public String toString() { return "Fans are off"; }
    }
    //------------------- End of added Fan Control code
}
