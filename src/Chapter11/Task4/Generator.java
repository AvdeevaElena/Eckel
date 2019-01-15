package Chapter11.Task4;

import java.util.*;

public class Generator {

   private int gen = 0;

   //static String[] actors = new String[] {"Оливия Данэм","Уолтер Бишоп","Питер Бишоп"};

   String next(){
     switch (gen) {
         default:
         //case 0: gen=0; return "Питер Бишоп";
         case 0: gen++; return "Оливия Данэм";
         case 1: gen++; return "Уолтер Бишоп";
         case 2: gen=0; return "Питер Бишоп";
     }
   }


    private static void fill(Collection<String> col) {
        Generator  sg = new Generator ();
        for (int i = 0; i < 10; i++) {
            col.add(sg.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        fill(al);
        System.out.println(al);

        LinkedList<String> ll = new LinkedList<>();
        fill(ll);
        System.out.println(ll);

        HashSet<String> hs = new HashSet<>();
        fill(hs);
        System.out.println(hs);

        TreeSet<String> ts = new TreeSet<>();
        fill(ts);
        System.out.println(ts);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        fill(lhs);
        System.out.println(lhs);
   }

}
