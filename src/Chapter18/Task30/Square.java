package Chapter18.Task30;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Square extends Shape {
    private static int color;
    public static void serializeStaticState(ObjectOutputStream os)
            throws IOException { os.writeInt(color); }
    public static void deserializeStaticState(ObjectInputStream os)
            throws IOException { color = os.readInt(); }
    public Square(int xVal, int yVal, int dim) {
        super(xVal, yVal, dim);
        color = RED;
    }
    public void setColor(int newColor) { color = newColor; }
    public int getColor() { return color; }
}