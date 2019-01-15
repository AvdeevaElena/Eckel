package Chapter21.Task37;

public class Car {

        private final int id;
        private boolean engine = false, driveTrain = false, wheels = false,
                exhaustSystem = false, body = false, fenders = false;

        Car(int id) {
        this.id = id;
    }

        synchronized int getId() {
        return id;
    }

        synchronized void addEngine() {
        engine = true;
    }

        synchronized void addDriveTrain() {
        driveTrain = true;
    }

        synchronized void addWheels() {
        wheels = true;
    }

        void addExhaustSystem() {
        exhaustSystem = true;
    }

        void addBody() {
        body = true;
    }

        void addFenders() {
        fenders = true;
    }

        @Override
        public synchronized String toString() {
        return "Car " + id + " [" + " engine: " + engine +
                " driveTrain: " + driveTrain +
                " wheels: " + wheels +
                " exhaustSystem: " + exhaustSystem +
                " body: " + body +
                " fenders: " + fenders + " ]";
    }
}
