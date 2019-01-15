package Chapter11.Task31;

public class Cycle {
    public void draw() {}
	public void erase() {}
	public void amend() { System.out.println("Shape.amend()"); }
	@Override
    public String toString() { return "Shape"; }
}
