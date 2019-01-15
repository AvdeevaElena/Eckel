package Chapter11.Task8;

import java.util.ArrayList;

public class Gerbil {
    int grbilNumber;
    Gerbil(int grbilNumber) {
        this.grbilNumber = grbilNumber;
    }
        void hop() {
            System.out.println(grbilNumber+" ");
        }

    public static void main(String[] args) {

        ArrayList<Gerbil> arr = new ArrayList<Gerbil>(){};
        arr.add(new Gerbil(1));
        arr.add(new Gerbil(333));
        arr.add(new Gerbil(111));
        arr.add(new Gerbil(133));

       for (int i = 0;i<arr.size(); i++) {
           arr.get(i).hop();
        }
    }
}


