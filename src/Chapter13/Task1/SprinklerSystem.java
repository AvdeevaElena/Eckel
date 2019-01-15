package Chapter13.Task1;

/*Exercise 1
/* Analyze SprinklerSystem.toString() in reusing/SprinklerSystem.java to discover
* whether writing the toString() with an explicit StringBuilder will save any
* StringBuilder creations.*/

public class SprinklerSystem {

    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    // appears to create only one StringBuilder: (using javap -c)
    public String toString() {
        return
                "valve1 = " + valve1 + " " +
                        "valve2 = " + valve2 + " " +
                        "valve3 = " + valve3 + " " +
                        "valve4 = " + valve4 + " " +
                        "i = " + i + " " + "f = " + f + " " +
                        "source = " + source;
    }
    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}
