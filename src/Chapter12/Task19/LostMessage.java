package Chapter12.Task19;


/*Exercise 19
// Repair the problem in LostMessage.java by guarding the call in the
// finally clause.*/

public class LostMessage {

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } catch(Exception e) {
                System.out.println(e);
            } finally {
                lm.dispose();
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
