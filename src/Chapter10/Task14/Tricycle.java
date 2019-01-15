package Chapter10.Task14;

public class Tricycle implements Cycle {
    public void ride () {System.out.println("Tricycle ride");};

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}
