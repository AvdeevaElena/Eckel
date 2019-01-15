package Chapter16.Task20;

import java.util.Arrays;

public class HaveInt {
        int anInt;

    HaveInt(int anInt){
        this.anInt = anInt;
    }


        public boolean equals(Object obj) {
            return (obj.getClass().getSimpleName() == "HaveInt"
                    && this.anInt == ((HaveInt)obj).anInt) ? true : false;
        }

    public static void main(String[] args) {
        HaveInt[] arr1 = new HaveInt[3];
        arr1[0] = new HaveInt(23);
        arr1[1] = new HaveInt(55);
        arr1[2] = new HaveInt(77);

        HaveInt[] arr2 = new HaveInt[3];
        arr2[0] = new HaveInt(23);
        arr2[1] = new HaveInt(55);
        arr2[2] = new HaveInt(77);

        System.out.println(Arrays.equals(arr1,arr2 ));
        System.out.println(arr1.equals(arr2));
        System.out.println(arr2.getClass().getSimpleName());

    }

}
