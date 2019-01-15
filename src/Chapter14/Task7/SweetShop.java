package Chapter14.Task7;

public class SweetShop {
    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Usage: sweetName");
            System.exit(0);
        }
        Class c = null;
        try {
            c = Class.forName(args[0]);
            System.out.println("Enjoy your " + args[0]);
        } catch(ClassNotFoundException e) {
            System.out.println("Couldn't find " + args[0]);
        }
    }
}
