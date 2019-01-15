package Chapter8.Task16;

public class RectangularGlyph extends Glyph{

    private int l = 7;
    private int w = 10;


    RectangularGlyph(int l, int w) {

        this.l = l;
        this.w =w;
        System.out.println("RectangularGlyph.RectangularGlyph(), l and w = " + l +" " + w);
    }

    void draw() {
        System.out.println("RectangularGlyph.draw(), l and w =  "  + l +" " + w);
    }


}
