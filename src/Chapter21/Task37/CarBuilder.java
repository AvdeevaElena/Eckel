package Chapter21.Task37;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


/* * Exercise 37: Modify CarBuilder.java to add another stage to the car-building process, whereby you add the exhaust
 * system, body, and fenders. As with the second stage, assume these processes can be performed simultaneously by robots.*/

public class CarBuilder {
    public static void main(String[] args) throws Exception {
        CarQueue chassisQueue = new CarQueue(), finishingQueue = new CarQueue();
        ExecutorService pool = Executors.newCachedThreadPool();
        RobotPool robotPool = new RobotPool();
        pool.execute(new EngineRobot(robotPool));
        pool.execute(new DriveTrainRobot(robotPool));
        pool.execute(new WheelRobot(robotPool));
        pool.execute(new ExhaustSystemRobot(robotPool));
        pool.execute(new BodyRobot(robotPool));
        pool.execute(new FendersRobot(robotPool));
        pool.execute(new Assembler(chassisQueue, finishingQueue, robotPool));
        pool.execute(new Reporter(finishingQueue));
        pool.execute(new ChassisBuilder(chassisQueue));
        TimeUnit.SECONDS.sleep(7);
        pool.shutdownNow();
    }
}
