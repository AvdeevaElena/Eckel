package Chapter21.Task37;

public class BodyRobot extends Robot {
    BodyRobot(RobotPool p) {
        super(p);
    }

    @Override
    protected void performService() {
        System.out.println(this + " installing Body");
        assembler.car().addBody();
    }
}
