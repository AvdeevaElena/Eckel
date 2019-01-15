package Chapter11.Task31;

public class Tricycle  extends Cycle {
    @Override
    public void draw() {
        System.out.println(("Tricycle.draw()")); }
    @Override
    public void erase() { System.out.println(("Tricycle.erase()")); }
    @Override
    public void amend() {System.out.println(("Tricycle.amend()")); }
    @Override
    public String toString() { return "Tricycle"; }

}
