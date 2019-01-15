package Chapter14.Task9;

/*Exercise 9
// Modify the previous exercise so that it uses Class.getDeclaredFields()
// to also display information about the fields in a class.*/

public class Hierarchy {

    public static void Hierarchy(Object o) {
        Object[] fields = o.getClass().getDeclaredFields();

        if(fields.length == 0 ) {
            System.out.println(o.getClass() + "have not  DeclaredFields");
        }
        else for (int i = 0; i<fields.length; i++) {
            System.out.println(fields[i]);
        }

    }
    public static void main(String[] args) {
        Hierarchy(new СBA());
    }
}
