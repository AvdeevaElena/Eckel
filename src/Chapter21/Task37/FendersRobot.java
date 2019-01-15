package Chapter21.Task37;

public class FendersRobot extends Robot {
    FendersRobot(RobotPool p) {
        super(p);
    }

    @Override
    protected void performService() {
        System.out.println(this + " installing Fenders");
        assembler.car().addFenders();
    }
}
