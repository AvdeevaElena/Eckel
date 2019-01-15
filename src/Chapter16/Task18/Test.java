package Chapter16.Task18;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        BerylliumSphere[] bsa1 = new BerylliumSphere[3];
        for(int i = 0; i < bsa1.length; i++)
            bsa1[i] = new BerylliumSphere();
        // Arrays.fill(bsa1, new BerylliumSphere());
        System.out.println(Arrays.toString(bsa1));
        BerylliumSphere[] bsa2 = new BerylliumSphere[4];
        System.out.println(Arrays.toString(bsa2));
        System.arraycopy(bsa1, 0, bsa2, 0, bsa1.length);
        System.out.println(Arrays.toString(bsa2));
        // no new BerylliumSpheres created in bsa2,
        // just new references to those in bsa1
    }
}
