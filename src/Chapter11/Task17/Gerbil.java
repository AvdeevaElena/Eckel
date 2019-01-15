package Chapter11.Task17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*Exercise 17: Take the Gerbil class in Exercise 1 and put it into a Map instead, associating each Gerbil’s name (e.g.
 * "Fuzzy" or "Spot") as a String (the key) for each Gerbil (the value) you put in the table. Get an Iterator for the
 * keySet( ) and use it to move through the Map, looking up the Gerbil for each key and printing out the key and telling
 * the Gerbil to hop( ).*/
public class Gerbil {

    int grbilNumber;

    Gerbil(int grbilNumber) {
        this.grbilNumber = grbilNumber;
    }

    void hop() {
        System.out.println(grbilNumber + " ");
    }

    public static void main(String[] args) {

        Map<String, Gerbil> mapGerbil = new HashMap<String, Gerbil>();
        mapGerbil.put("key 1", new Gerbil(1));
        mapGerbil.put("key 3", new Gerbil(33));
        mapGerbil.put("key 2", new Gerbil(22));
        System.out.println(mapGerbil);

        Set<String> set = mapGerbil.keySet();
        System.out.println(set.toString());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {

            String strValue = it.next();
            System.out.print(strValue + " ");
            mapGerbil.get(strValue).hop();
        }
    }

}


