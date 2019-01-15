package Chapter8.Task3;

public class Triangle extends Shape {
    @Override
    public void draw() { System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() { System.out.println("Triangle.erase()"); }

    @Override
    public void report () {
        System.out.println("Report Triangle");
    }
}
