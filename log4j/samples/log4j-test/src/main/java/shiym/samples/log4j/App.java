package shiym.samples.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        PropertyConfigurator.configure( "log4j.properties");
        Logger logger = Logger.getLogger("AppLogger");
        logger.trace((Object)"This is a trace log.");
        logger.debug((Object)"This is a debug log");
        logger.info((Object)"This is an info log");
        logger.warn((Object)"This is a warning log");
        logger.error((Object)"This is an error log");
        logger.fatal((Object)"This is n fatal log");
        System.out.println("Hello");
    }
}
