package Chapter7.Task11.Task11;

/*Exercise 11: (3) Modify Detergent.java so that it uses delegation*/

public class Deterent {

   private Cleanser cleanser = new Cleanser();

   private String name;

   Deterent(String name) { this.name = name; }


    public void  delete (){cleanser.dilute();}
    public void add() {cleanser.apply();}
    public void sc()   {cleanser.scrub();}

}
