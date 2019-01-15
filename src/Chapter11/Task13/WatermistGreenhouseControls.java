package Chapter11.Task13;

public class WatermistGreenhouseControls extends GreenhouseControls {
    private boolean watermist = false;

    public class WaterMistOn extends Event {
        public WaterMistOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            // Put hardware control code here to
            // physically turn on the water mist generators.
            watermist = true;
        }

        public String toString() {
            return "Water mist generators are on";
        }
    }

    public class WaterMistOff extends Event {
        public WaterMistOff(long delayTime) { super(delayTime); }
        public void action() {
            // Put hardware control code here to
            // physically turn off the water mist generators.
            watermist = false;
        }
        public String toString() { return "Water mist generators are off"; }
    }
}