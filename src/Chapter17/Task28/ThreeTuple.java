package Chapter17.Task28;

public class ThreeTuple<A,B,C> extends TwoTuple<A,B> implements Comparable {
    public final C third;


    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        third = c;
    }

    public int hashCode() {
        int result = 17;
        result = result * 37 + first.hashCode();
        result = result * 37 + second.hashCode();
        result = result * 37 + third.hashCode();
        return result;
    }

    public boolean equals(Object o) {
        return o instanceof ThreeTuple &&
                ((ThreeTuple) o).first.equals(first) &&
                ((ThreeTuple) o).second.equals(second) &&
                ((ThreeTuple) o).third.equals(third);
    }

    public int compareTo(Object o) {
        if (!(o instanceof ThreeTuple)) throw new ClassCastException();
        ThreeTuple t = (ThreeTuple) o;
        return (this.hashCode() - t.hashCode() < 0) ? -1 :
                ((this.hashCode() - t.hashCode() > 0 ? 1 : 0));
    }

    public String toString() {
        return "(" + first + ", " + second +  third+", "+ ")";
    }

}
