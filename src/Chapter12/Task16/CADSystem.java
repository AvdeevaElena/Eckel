package Chapter12.Task16;


/*Exercise 16
// MOdify reusing/CADSystem.java to demonstrate that returning from the
// middle of a try-finally will still perform proper cleanup.*/

public class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];
    public CADSystem(int i) {
        super(i + 1);
        for(int j = 0; j < lines.length; j++)
            lines[j] = new Line(j, j*j);
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("Combined constructor");
    }
    public void dispose() {
        System.out.println("CADSystem.dispose()");
        // The order of cleanup is the reverse
        // of the order of initialization
        t.dispose();
        c.dispose();
        for(int i = lines.length - 1; i >= 0; i--)
            lines[i].dispose();
        super.dispose();
    }
    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
            System.out.println("Returning from try block");
            return;
            // unreachable statement:
            // print("You can't see this");
            // but finally block will still execute:
        } finally {
            x.dispose();
        }
    }
}
