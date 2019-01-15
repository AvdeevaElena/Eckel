package Chapter16.Task21;

import java.util.Comparator;

public class CompBerylliumSphereComparator implements Comparator<CompBerylliumSphere> {
        public int compare(CompBerylliumSphere c1, CompBerylliumSphere c2) {
            return (c1.id > c2.id ? -1 : (c1.id == c2.id ? 0 : 1));
        }
}
