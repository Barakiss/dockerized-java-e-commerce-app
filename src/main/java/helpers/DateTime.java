package helpers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <h1>Date Time</h1>
 *
 * @author Mike-George Verros
 * @version 1.0
 */
public class DateTime {

    final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(DateTime.class);

    public static String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getDateTimeForDatabase() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static Date getNowDateTime() {
        if(logger.isDebugEnabled()){ logger.debug("Get Now Date Time"); }
        return new Date();
    }

}
