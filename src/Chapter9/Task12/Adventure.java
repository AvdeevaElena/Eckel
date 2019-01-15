package Chapter9.Task12;

public class Adventure {

    /**/

    public static void t(CanFight x) { x.fight(); }
    public static void u(CanSwim x) { x.swim(); }
    public static void v(CanFly x) { x.fly(); }
    public static void c(CanClimb x) { x.climb(); }
    public static void w(ActionCharacter x) { x.fight(); }


    public static void main(String[] args) {
   Hero hero = new Hero();
   t(hero);
   u(hero);
   v(hero);
   w(hero);
   c(hero);
    }

}
