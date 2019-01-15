package Chapter21.Task8;

import Chapter21.Examples.LiftOff;

public class MoreBasicThreads {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new LiftOff());
            thread.setDaemon(true);
            thread.start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
