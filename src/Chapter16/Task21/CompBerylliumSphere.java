package Chapter16.Task21;

public class CompBerylliumSphere implements Comparable<CompBerylliumSphere> {
    private static long count;
    protected final long id = count++;
    public int compareTo(CompBerylliumSphere c2) {
        return (this.id < c2.id ? -1 : (this.id == c2.id ? 0 : 1));
    }

    public String toString() {
        return "BerylliumSphere " + id;
    }
}
