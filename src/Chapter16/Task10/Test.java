package Chapter16.Task10;

import java.util.ArrayList;
import java.util.List;

/*Exercise 10, page 762
// Modify ArrayOfGeneric.java to use containers instead of arrays.
// Show that you can eliminate the compile-time warnings.*/

public class Test {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<List<String>> lls = new ArrayList<List<String>>();
        List<List> l = new ArrayList<List>();

        lls.add(new ArrayList<String>());
        List<Object> lo = new ArrayList<Object>();

        List<List<BerylliumSphere>> llb = new ArrayList<List<BerylliumSphere>>();
        for(int i = 0; i < 10; i++) {

            llb.add(new ArrayList<BerylliumSphere>());
            for(int j = 0; j < 2; j++)
                llb.get(i).add(new BerylliumSphere());
        }
        System.out.println(llb);
    }
}
