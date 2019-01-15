package Chapter17.Task28;

public class TwoTuple <A,B> implements Comparable {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        first = a;
        second = b;
    }

    public int hashCode() {
        int result = 17;
        result = result * 37 + first.hashCode();
        result = result * 37 + second.hashCode();
        return result;
    }

    public boolean equals(Object o) {
        return o instanceof TwoTuple &&
                ((TwoTuple) o).first.equals(first) &&
                ((TwoTuple) o).second.equals(second);
    }

    public int compareTo(Object o) {
        if (!(o instanceof TwoTuple)) throw new ClassCastException();
        TwoTuple t = (TwoTuple) o;
        return (this.hashCode() - t.hashCode() < 0) ? -1 :
                ((this.hashCode() - t.hashCode() > 0 ? 1 : 0));
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}