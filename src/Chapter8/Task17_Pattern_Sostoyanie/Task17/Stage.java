package Chapter8.Task17_Pattern_Sostoyanie.Task17;

public class Stage {
    Actor actor = new HappyActor();


    public void change() {actor = new SadActor();}

    public void performPlay() {actor.act();}
}
