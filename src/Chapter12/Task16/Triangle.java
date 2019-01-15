package Chapter12.Task16;

public class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");
    }
    void dipsose() {
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}