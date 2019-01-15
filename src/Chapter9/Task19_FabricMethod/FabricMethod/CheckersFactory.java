package Chapter9.Task19_FabricMethod.FabricMethod;

public class CheckersFactory implements GameFactory {

    public Game getGame() { return new Checkers(); }
}
