package Chapter11.Task13;

public class Test {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();

        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new FansOn(200),			//Adding event that switches fans on
                gc.new FansOff(400),		//Adding event that switches fans off
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if(args.length == 1)
            gc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])));
        gc.run();
    }
}
