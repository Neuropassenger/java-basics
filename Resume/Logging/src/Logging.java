import java.util.logging.*;

/**
 * Created by turge on 007 07.10.16.
 */
public class Logging {
    public static void main(String[] args) {
        configureLogging();
    }

    private static void configureLogging() {
        Logger a = Logger.getLogger(A.class.getName());
        Logger b = Logger.getLogger(B.class.getName());
        Logger java = Logger.getLogger("org.stepic.java");

        a.setLevel(Level.ALL);
        b.setLevel(Level.WARNING);
        java.setUseParentHandlers(false);

        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.ALL);
        java.addHandler(ch);

        XMLFormatter xf = new XMLFormatter();
        ch.setFormatter(xf);
    }
}
