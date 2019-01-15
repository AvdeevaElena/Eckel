package Chapter17.Task18;

// Exercise 18: Using SlowMap.java for inspiration, create a SlowSet.
import java.util.*;
public class SlowSet<E> implements Set<E> {
    private List<E> list = new ArrayList<>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return list.toArray(a);
    }

    @Override
    public boolean add(E e) {
        return !list.contains(e) && list.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c) {
            modified |= add(e);
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @Override
    public void clear() {
        list.clear();
    }
    public static void main(String[] args) {
        SlowSet<String> ss = new SlowSet<String>();
        ss.add("hi");
        System.out.println(ss);
        ss.add("there");
        System.out.println(ss);
        List<String> list = Arrays.asList("you", "cutie", "pie");
        ss.addAll(list);
        System.out.println(ss);
        System.out.println("ss.size() = " + ss.size());
        System.out.println("ss.contains(\"you\"): " + ss.contains("you"));
        System.out.println("ss.contains(\"me\"): " + ss.contains("me"));
        System.out.println("ss.containsAll(list): " + ss.containsAll(list));
        SlowSet<String> ss2 = new SlowSet<String>();
        System.out.println("ss2 = " + ss2);
        System.out.println("ss.containsAll(ss2): " + ss.containsAll(ss2));
        System.out.println("ss2.containAll(ss): " + ss2.containsAll(ss));
        ss2.add("you");
        ss2.add("cutie");
        ss.removeAll(ss2);
        System.out.println("ss = " + ss);
        System.out.println("ss.hashCode() = " + ss.hashCode());
        List<String> list2 = Arrays.asList("hi", "there", "pie");
        ss2.remove("you");
        System.out.println(ss2);
        System.out.println("ss2.isEmpty(): " + ss2.isEmpty());
        ss2.clear();
        System.out.println("ss2.isEmpty(): " + ss2.isEmpty());
        ss2.addAll(list2);
        System.out.println("ss2 = " + ss2);
        System.out.println("ss.equals(ss2): " + ss.equals(ss2));
        String[] sa = new String[3];
        System.out.println("ss.toArray(sa): " + ss.toArray(sa));
        for(int i = 0; i < sa.length; i++) System.out.print(sa[i] + " " );
    }
}