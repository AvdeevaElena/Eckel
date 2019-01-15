package Chapter21.Task35;

public class WebClient {
    private final int serviceTime;

    WebClient(int serviceTime) {
        this.serviceTime = serviceTime;
    }

    int getServiceTime() {
        return serviceTime;
    }

    @Override
    public String toString() {
        return "[" + serviceTime + "]";
    }
}
