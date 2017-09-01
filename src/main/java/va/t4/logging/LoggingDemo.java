package va.t4.logging;

import java.io.IOException;
import java.util.logging.*;

public class LoggingDemo {

    public static void main(String[] args) throws IOException {

        Logger logger=Logger.getLogger("va.t4.logging");
        logger.setLevel(Level.FINE);
//        FileHandler fileHandler=new FileHandler("c:/java_project/july2017/01_09_17t4/logging");
        FileHandler fileHandler=new FileHandler("logging_demo.txt");
        fileHandler.setFormatter(new XMLFormatter());
        logger.addHandler(fileHandler);

        new ClassA().doSomething();
        new ClassB().doSomethingElse();
    }
}
