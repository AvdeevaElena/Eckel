package Chapter17.Task28;

public class FourTuple<A,B,C,D> extends ThreeTuple<A,B,C> implements Comparable {
    public final D fourth;


    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        fourth = d;
    }

    public int hashCode() {
        int result = 17;
        result = result * 37 + first.hashCode();
        result = result * 37 + second.hashCode();
        result = result * 37 + third.hashCode();
        result = result * 37 + fourth.hashCode();
        return result;
    }

    public boolean equals(Object o) {
        return o instanceof FourTuple &&
                ((FourTuple) o).first.equals(first) &&
                ((FourTuple) o).second.equals(second) &&
                ((FourTuple) o).third.equals(third) &&
                ((FourTuple) o).fourth.equals(fourth);
    }

    public int compareTo(Object o) {
        if (!(o instanceof FourTuple)) throw new ClassCastException();
        FourTuple t = (FourTuple) o;
        return (this.hashCode() - t.hashCode() < 0) ? -1 :
                ((this.hashCode() - t.hashCode() > 0 ? 1 : 0));
    }

    public String toString() {
        return "(" + first + ", " + second +  third+", " +fourth  +", "+ ")";
    }

}

