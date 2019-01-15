package Chapter8.Task17_Pattern_Sostoyanie.Task17;

public class Starship {

    private static  int i  =1;

    Actor actor = new SimpleActor();
    public void changeAlert() {
        if (++i % 2 ==0) actor = new HappyActor();
        if (++i %3 ==0) actor = new SimpleActor();
        else actor = new SadActor();}

    public void alert () {actor.act();}


}
