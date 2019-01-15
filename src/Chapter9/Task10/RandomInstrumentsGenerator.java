package Chapter9.Task10;

import java.util.Random;

public class RandomInstrumentsGenerator {

    private Random rand = new Random(47);

    public Playable next(){
        int inst = rand.nextInt(6);
        switch (inst) {
            default:
            case 0: return new Brass();
            case 1: return new Drum();
            case 2: return new Percussion();
            case 3: return new Stringed();
            case 4: return new Wind();
            case 5: return new Woodwind();
        }

    }
}
