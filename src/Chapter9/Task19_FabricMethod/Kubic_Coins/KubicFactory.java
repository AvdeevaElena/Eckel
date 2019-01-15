package Chapter9.Task19_FabricMethod.Kubic_Coins;

public class KubicFactory implements GameFactory {
    public Game getGame() { return new Kubic(); }
}
