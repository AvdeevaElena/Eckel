package Chapter14.Task8;

public class Hierarchy {

    public static void Hierarchy(Object o) {
        if(o.getClass().getSuperclass() != null) {
            System.out.println(o.getClass() + " is a subclass of " +
                    o.getClass().getSuperclass());
            try {
                Hierarchy(o.getClass().getSuperclass().newInstance());
            } catch(InstantiationException e) {
                System.out.println("Unable to instantiate obj");
            } catch(IllegalAccessException e) {
                System.out.println("Unable to access");
            }
        }
    }
    public static void main(String[] args) {
        Hierarchy(new СBA());
    }
}
