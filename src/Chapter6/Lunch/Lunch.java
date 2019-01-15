package Chapter6.Lunch;

public class Lunch {

    void testPrivate () {

       /// Soup2 soup  = new Soup2(); Нельзя так как конструктор private
    }

    void testStatic() {
        Soup1 soup1 = Soup1.makeSoup(); //

    }

    void testSingleTone () {
        Soup2.access().f();      // СИНГЛТОНЕ
    }
}
