package Chapter8.Task2;

public class Circle extends Shape{
    @Override
    public void draw() { System.out.println("Circle.draw()");
    }
    @Override
    public void erase() { System.out.println("Circle.erase()"); }
    @Override
    public void report () {
        System.out.println("Report Circle");
    }
}
