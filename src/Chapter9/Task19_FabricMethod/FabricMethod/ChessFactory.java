package Chapter9.Task19_FabricMethod.FabricMethod;

public class ChessFactory  implements GameFactory{

    public Game getGame() { return new Chess(); }
}
