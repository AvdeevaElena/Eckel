package Chapter10.Task14;

public class Bicycle implements Cycle {

   public void ride () {System.out.println("Bicycle ride");};

   public static CycleFactory factory = new CycleFactory() {
      @Override
      public Cycle getCycle() {
         return new Bicycle();
      }
   };
}
