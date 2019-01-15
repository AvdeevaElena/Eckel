package Chapter16.Task9;

import java.util.ArrayList;
import java.util.List;

/*Exercise 9,
/* Create the classes necessary for the Peel<Banana> example and
* show that the compiler doesn't accept it. Fix the problem
* using an ArrayList.*/

public class Test<T> {
    public static void main(String[] args) {

        List<Peel<Banana>> peels = new ArrayList<Peel<Banana>>();
        for(int i = 0; i < 10; i++)
            peels.add(new Peel<Banana>(new Banana()));
        System.out.println(peels);
        System.out.println("peels.get(0).getClass(): " + peels.get(0).getClass());
    }
}
