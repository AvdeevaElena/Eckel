package Chapter7.Task23;

public class Amphibian {


    static int i =112;

    final void swim () {
        System.out.println( "SWIM");
    }
    void voice () {
        System.out.println( "B-b-b-buuul");
    }

    static int count(){
        i++;
        System.out.println(i);
        return i;
    };


}
