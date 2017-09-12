package new_av.t4.logging;


import java.io.IOException;
import java.util.logging.*;

public class LoggingDemo {
    public static void main(String[] args) throws IOException {

        Logger logger=Logger.getLogger("new_av.t4.logging");
        logger.setLevel(Level.FINE);
        FileHandler fileHandler=new FileHandler("loggerDemo.txt");
        fileHandler.setFormatter(new XMLFormatter());
        logger.addHandler(fileHandler);

        new ClassA().doSomething();
        new ClassB().doSomethingElse ();


    }
}
