package new_av.t4.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassB {
    private static final Logger LOGGER = Logger.getLogger(ClassB.class.getName());

    public void doSomethingElse() {
        LOGGER.log(Level.INFO, "Hello from ClassB(info): {0}", 343);
        LOGGER.log(Level.SEVERE, "Exception", new Exception());
    }
}
