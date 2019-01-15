package Chapter16.Task2;

import java.util.Arrays;

/*
// Exercise 2
// Write a method that takes an int argument and returns an
// array of that size filled BerylliumSpheres.*/

public class ReturnArrTest {

   static BerylliumSphere[]  returnArr(int val) {

        BerylliumSphere[] bshArr = new BerylliumSphere[val];

        for (int i=0; i<val; i++) {
            bshArr[i] = new BerylliumSphere();
        }
        return bshArr;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.asList(returnArr(5)));

    }
}
