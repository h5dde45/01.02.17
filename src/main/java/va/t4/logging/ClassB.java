package va.t4.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassB {

    private static final Logger LOGGER = Logger.getLogger(ClassB.class.getName());

    public void doSomethingElse() {
        LOGGER.log(Level.INFO, "Hello from ClassB: {0}", 33);
        LOGGER.log(Level.SEVERE, "Exception", new Exception());
    }
}

