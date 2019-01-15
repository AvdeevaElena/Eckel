package Chapter11.Task6;

import java.util.*;

public class StringFeature {

    static ArrayList<String> arrayList(int num) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < num; i++) {

            arrayList.add("It is String "+i);
        }
        return arrayList;
    }


    public static void main(String[] args) {
        Random rand = new Random(47);
        List<String> strings = StringFeature .arrayList(7);
        System.out.println("1: " + strings);
        String string2 = "string 2";
        strings.add(string2);
        System.out.println("2: " + strings);
        System.out.println("3: " + strings.contains(string2));
        strings.remove(string2);
        String i = strings.get(2);
        System.out.println("4: " + i + " " + strings.indexOf(i));
        String string5 = "string 5";
        System.out.println("5: " + strings.indexOf(string5));
        System.out.println("6: " + strings.remove(string5));
        System.out.println("7: " + strings.remove(i));
        System.out.println("8: " + strings);
        strings.add(3, "string 9");
        System.out.println("9: " + strings);
        List<String> subStrings = strings.subList(1, 4);
        System.out.println("subList: " + subStrings);
        System.out.println("10: " + strings.containsAll(subStrings));
        Collections.sort(subStrings);
        System.out.println("sorted subList: " + subStrings);
        System.out.println("11: " + strings.containsAll(subStrings));
        Collections.shuffle(subStrings, rand);
        System.out.println("shuffled subList: " + subStrings);
        System.out.println("12: " + strings.containsAll(subStrings));
        List<String> copy = new ArrayList<>(strings);
        subStrings = Arrays.asList(strings.get(1), strings.get(4));
        System.out.println("subStrings: " + subStrings);
        copy.retainAll(subStrings);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(strings);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(subStrings);
        System.out.println("15: " + copy);
        copy.set(1, "string 16");
        System.out.println("16: " + copy);
        copy.addAll(2, subStrings);
        System.out.println("17: " + copy);
        System.out.println("18: " + strings.isEmpty());
        strings.clear();
        System.out.println("19: " + strings);
        System.out.println("20: " + strings.isEmpty());
        strings.addAll(StringFeature .arrayList(4));
        System.out.println("21: " + strings);
        Object[] o = strings.toArray();
        System.out.println("22: " + o[3]);
        String[] pa = strings.toArray(new String[0]);
        System.out.println("23: " + pa[3]);
    }
}
