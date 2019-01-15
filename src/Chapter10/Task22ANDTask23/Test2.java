package Chapter10.Task22ANDTask23;

public class Test2 {
    public static void main(String[] args) {
        WatermistGreenhouseControls wmgc = new WatermistGreenhouseControls();	//Type of controls has to be changed
        wmgc.addEvent(wmgc.new Bell(900));
        Event[] eventList = {
                wmgc.new WaterMistOn(200),			//Adding event that switches water mist generators on
                wmgc.new WaterMistOff(400),		//Adding event that switches water mist generators off
        };
        wmgc.addEvent(wmgc.new Restart(2000, eventList));
        if(args.length == 1)
            wmgc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])));
        wmgc.run();
    }
}
