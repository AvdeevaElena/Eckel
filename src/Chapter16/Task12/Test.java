package Chapter16.Task12;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        double[] arrDouble = new double[5];
        CountingGenerator.Double dGen =
                new CountingGenerator.Double();
        for(int i = 0; i < arrDouble.length; i++)
            arrDouble[i] = dGen.next();


        System.out.println(Arrays.toString(arrDouble));
    }
}
