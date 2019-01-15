package Chapter7.Task14;

public class Car {
    public Engine engine = new Engine();

  //  public Wheel[] wheel = new Wheel[4];
  //  public Door left = new Door(), right = new Door(); // 2-door public Car()
 //   {
//for(int i = 0; i < 4; i++)
 //   wheel[i] = new Wheel();


    public static void main(String[] args) {
        Car car = new Car();
        car.engine.service();
    }

}
