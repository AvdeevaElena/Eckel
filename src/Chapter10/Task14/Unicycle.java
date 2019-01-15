package Chapter10.Task14;

public class Unicycle  implements Cycle {

    public void ride () {System.out.println("Unicycle ride");};

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}
