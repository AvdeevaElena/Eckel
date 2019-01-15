package Chapter21.Task29;

public class Toast {

        public enum Status {
            DRY, BUTTERED, JAMMED
        }

        private Status status = Status.DRY;
        private final int id;

        Toast(int idn) {
        id = idn;
    }

        void butter() {
        status = Status.BUTTERED;
    }

        void jam() {
        status = Status.JAMMED;
    }

        Status getStatus() {
        return status;
    }

        public int getId() {
        return id;
    }

        public String toString() {
        return "Toast " + id + ": " + status; }
    }