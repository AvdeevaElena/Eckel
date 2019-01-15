package Chapter12.Task30;

public class Human {
    public static void main(String[] args) {
        WrapCheckedExceptions wce =
                new WrapCheckedExceptions();
        for(int i = 0; i < 3; i++)
            try {
                if(i < 3)
                    wce.throwRuntimeException(i);
                else
                    throw new RuntimeException();
            }	catch(RuntimeException re) {
                try {
                    throw re.getCause();
                } 	catch(Sneeze e) {
                    System.out.println("Sneeze: " + e);
                }	catch(Annoyance e) {
                    System.out.println("Annoyance: " + e);
                }	catch(Throwable e) {
                    System.out.println("Throwable: " + e);
                }
            }
    }
}
