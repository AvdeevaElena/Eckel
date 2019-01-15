package Chapter12.Task6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class MyExption_1 extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");

    public MyExption_1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

