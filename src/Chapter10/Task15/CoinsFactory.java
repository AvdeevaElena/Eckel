package Chapter10.Task15;

public class CoinsFactory implements GameFactory {

    public Game getGame() { return new Coins(); }
}
