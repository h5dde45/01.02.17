package new_av.t4.logging;

import java.util.logging.Logger;

public class ClassA {
    private static final Logger LOGGER=Logger.getLogger(ClassA.class.getName());
    void doSomething(){
        LOGGER.fine("Hello from ClassA(fine)");
        LOGGER.config("Hello from ClassA(config)");
        LOGGER.info("Hello from ClassA(info)");
    }
}
