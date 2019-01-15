package Chapter10.Task15;

public class KubicFactory implements GameFactory {
    public Game getGame() { return new Kubic(); }
}
