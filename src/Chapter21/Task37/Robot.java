package Chapter21.Task37;

import java.util.concurrent.BrokenBarrierException;

abstract class Robot implements Runnable {
    private RobotPool pool;
    private boolean engage = false;
    protected Assembler assembler;

    Robot(RobotPool p) {
        pool = p;
    }


    Robot assignAssembler(Assembler assembler) {
        this.assembler = assembler;
        return this;
    }

    synchronized void engage() {
        engage = true;
        notifyAll();
    }

    abstract protected void performService();

    @Override
    public void run() {
        try {
            powerDown();
            while (!Thread.interrupted()) {
                performService();
                assembler.barrier().await();
                powerDown();
            }
        } catch (InterruptedException e) {
            System.out.println("Exiting " + this + " via interrupt");
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this + " off");
    }

    private synchronized void powerDown() throws InterruptedException {
        engage = false;
        assembler = null;
        pool.release(this);
        while (!engage) {
            wait();
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}