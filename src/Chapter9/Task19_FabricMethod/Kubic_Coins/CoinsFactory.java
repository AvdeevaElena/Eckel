package Chapter9.Task19_FabricMethod.Kubic_Coins;

public class CoinsFactory implements GameFactory{

    public Game getGame() { return new Coins(); }
}
