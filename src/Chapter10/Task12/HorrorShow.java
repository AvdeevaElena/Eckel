package Chapter10.Task12;

public class HorrorShow {
    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) { l.kill();};

    public static void main(String[] args) {

        DangerousMonster barney = new DragonZilla().dangerousMonster(); //A method call has to be added
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire().vampire();					//A method call has to be added
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
