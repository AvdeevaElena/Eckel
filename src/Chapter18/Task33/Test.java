package Chapter18.Task33;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.prefs.Preferences;

import static java.util.prefs.Preferences.*;

public class Test {
    public static void main(String[] args) throws Exception {


        Preferences prefs = userNodeForPackage(Task33.class);
        int value = prefs.getInt("base directory", 0);
        System.out.print("Base directory value = " + value +
                "\nEnter new base directory value (integer): ");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            value = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
        prefs.putInt("base directory", value);
    }
}
