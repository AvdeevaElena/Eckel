package Chapter16.Task21;

/*Exercise 21
// Try to sort an array of the objects in Exercise 18. Implement
// Comparable to fix the problem. Now create a Comparator to sort
// the objects into reverse order.*/


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        BerylliumSphere[] bsa = new BerylliumSphere[5];
        for(int i = 0; i < bsa.length; i++)
            bsa[i] = new BerylliumSphere();
        // Arrays.sort(bsa); // runtime ClassCastException
        CompBerylliumSphere[] cbsa = new CompBerylliumSphere[5];
        for(int i = 0; i < cbsa.length; i++)
            cbsa[i] = new CompBerylliumSphere();
        System.out.println("unsorted:");
        System.out.println(Arrays.toString(cbsa));
        Arrays.sort(cbsa);
        System.out.println("sorted:");
        System.out.println(Arrays.toString(cbsa));
        Arrays.sort(cbsa, new CompBerylliumSphereComparator());
        System.out.println("reverse sorted:");
        System.out.println(Arrays.toString(cbsa));
    }
}
