package Chapter12.Task30;

public class WrapCheckedExceptions {
    void throwRuntimeException(int type) {
        try {
            switch(type) {
                case(0):
                    throw new Annoyance();
                case(1):
                    throw new Sneeze();
                case(2):
                    throw new RuntimeException("Where am I?");
                default: return;
            }
        } 	catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
