package Chapter11.Task14;

/*
Exercise 14: Create an empty LinkedList<Integer>. Using a Listlterator, add Integers to the List by always inserting
 * them in the middle of the List.*/


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinckedListIterator {

    public static void main(String[] args) {
       List<Integer> linkedList = new LinkedList<Integer>();
       ListIterator<Integer> it = linkedList.listIterator(linkedList.size()/2);

     for (int i=0; i<10; i++) {
      it.add(i);
       }
      System.out.println(linkedList);
     }
 }

