package Chapter21.Task35;

import java.util.concurrent.ArrayBlockingQueue;

public class WebClientLine extends ArrayBlockingQueue<WebClient> {
    WebClientLine(int maxLineSize) {
        super(maxLineSize);
    }

    @Override
    public String toString() {
        if (this.size() == 0) {
            return "[Empty]";
        }
        StringBuilder result = new StringBuilder();
        for (WebClient webClient : this) {
            result.append(webClient);
        }
        return result.toString();
    }
}
