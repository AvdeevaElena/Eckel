package Chapter16.Task24;

import java.util.Arrays;


/*Exercise 24
// Show that the class from Exercise 19 can be searched*/

public class HaveInt implements Comparable<HaveInt>{
        int anInt;

    HaveInt(int anInt){
        this.anInt = anInt;
    }


        public boolean equals(Object obj) {
            return (obj.getClass().getSimpleName() == "HaveInt"
                    && this.anInt == ((HaveInt)obj).anInt) ? true : false;
        }

    public int compareTo(HaveInt hi) {
        return (this.anInt < hi.anInt ? -1 : (this.anInt == hi.anInt ? 0 : 1));
    }


    public static void main(String[] args) {
        HaveInt[] a = { new HaveInt(1), new HaveInt(2), new HaveInt(3), new HaveInt(4), new HaveInt(5) };
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        int index = Arrays.binarySearch(a, new HaveInt(3));
        System.out.println("Index: " + index + ", " + a[index]);
    }

}
