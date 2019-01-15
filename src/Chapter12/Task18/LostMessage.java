package Chapter12.Task18;

/*Exercise 18
// Add a second level of exception loss to LostMessage.java so that the
// HoHumException is itself replaced by a third exception.*/

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    void eliminate() throws MeaninglessException {
        throw new MeaninglessException();
    }
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                try {
                    lm.f();
                    lm.dispose();
                } finally {
                    lm.eliminate();
                }
            } catch(Exception e) {
                System.out.println(e);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
