package Chapter11.Task31;

import java.util.Iterator;
import java.util.Random;

/*Exercise 31
/* Modify polymorphism/shape/RandomShapeGenerator.java to make it
* Iterable. You'll need to add a constructor that takes the number of
* elements that you want the iterator to produce before stopping. Verify
* that it works.*/

public class RandomShapeGenerator {
    private Random rand = new Random();

    public Cycle make() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Bicycle();
            case 1:
                return new Unicycle();
            case 2:
                return new Tricycle();
        }
    }

    private Cycle[] cycles;

    RandomShapeGenerator(int n) {
        cycles = new Cycle[n];
        for (int i = 0; i < n; i++)
            cycles[i] = make();

    }

    public Iterator<Cycle> iterator()  {
        return new Iterator<Cycle>() {
            private int index = 0;

            public boolean hasNext() {
                return index < cycles.length;
            }

            public Cycle next() {
                return cycles[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        RandomShapeGenerator rsg = new RandomShapeGenerator(20);
        for (int i = 0; i < 20; i++) {
            System.out.println(rsg);
        }


    }
}
