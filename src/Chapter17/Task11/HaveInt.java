package Chapter17.Task11;

import java.util.Random;

public class HaveInt implements Comparable<HaveInt>{
    Random rand = new Random();
    Integer aInt = rand.nextInt(100);

    public int compareTo(HaveInt hi) {
        int d = this.aInt - hi.aInt;
        return d < 0 ? -1 : d == 0 ? 0 : 1;
    }
    public String toString() {
        return Integer.toString(aInt);
    }
}
