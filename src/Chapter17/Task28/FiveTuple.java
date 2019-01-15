package Chapter17.Task28;

public class FiveTuple<A,B,C,D, E> extends FourTuple<A,B,C, D> implements Comparable {
    public final E fifth;


    public FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        fifth = e;
    }

    public int hashCode() {
        int result = 17;
        result = result * 37 + first.hashCode();
        result = result * 37 + second.hashCode();
        result = result * 37 + third.hashCode();
        result = result * 37 + fourth.hashCode();
        result = result * 37 + fifth.hashCode();
        return result;
    }

    public boolean equals(Object o) {
        return o instanceof FiveTuple &&
                ((FiveTuple) o).first.equals(first) &&
                ((FiveTuple) o).second.equals(second) &&
                ((FiveTuple) o).third.equals(third) &&
                ((FiveTuple) o).fourth.equals(fourth) &&
                ((FiveTuple) o).fifth.equals(fifth);
    }

    public int compareTo(Object o) {
        if (!(o instanceof FiveTuple)) throw new ClassCastException();
        FiveTuple t = (FiveTuple) o;
        return (this.hashCode() - t.hashCode() < 0) ? -1 :
                ((this.hashCode() - t.hashCode() > 0 ? 1 : 0));
    }

    public String toString() {
        return "(" + first + ", " + second +  third+", " +fourth  +", "+fifth +", "+")";
    }

}

