package Chapter11.Task31;

public class Bicycle extends Cycle {
	@Override
    public void draw() {
      System.out.println(("Circle.draw()")); }
    @Override
public void erase() { System.out.println(("Circle.erase()")); }
	@Override
    public void amend() {System.out.println(("Circle.amend()")); }
	@Override
    public String toString() { return "Circle"; }
}
