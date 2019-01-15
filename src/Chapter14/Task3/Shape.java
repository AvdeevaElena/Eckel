package Chapter14.Task3;

public abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}
