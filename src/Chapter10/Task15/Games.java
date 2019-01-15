package Chapter10.Task15;

public class Games {
public static void play(GameFactory gameFactory) {

    Game game = gameFactory.getGame();
    game.throwen();
}


    public static void main(String[] args) {
        play(Kubic.factory);
        play(Coins.factory);
    }
}
