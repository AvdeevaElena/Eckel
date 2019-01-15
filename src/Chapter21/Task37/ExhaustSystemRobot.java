package Chapter21.Task37;

public class ExhaustSystemRobot extends Robot {
    ExhaustSystemRobot(RobotPool p) {
        super(p);
    }

    @Override
    protected void performService() {
        System.out.println(this + " installing ExhaustSystem");
        assembler.car().addExhaustSystem();
    }
}

