package Chapter11.Task31;

public class Unicycle  extends Cycle {
    @Override
    public void draw() {
        System.out.println(("Unicycle.draw()")); }
    @Override
    public void erase() { System.out.println(("Unicycle.erase()")); }
    @Override
    public void amend() {System.out.println(("Unicycle.amend()")); }
    @Override
    public String toString() { return "Unicycle"; }

}
