package Chapter9.Task19_FabricMethod.Kubic_Coins;

public class Games {

    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while (s.throwen());}


    public static void main(String[] args) {

       // playGame(new CoinsFactory());
        playGame(new KubicFactory());

    }
}
