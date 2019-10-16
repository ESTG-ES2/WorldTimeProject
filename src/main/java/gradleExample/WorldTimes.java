package gradleExample;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;

/**
 * So para ter alguma coisa comentada
 */
public class WorldTimes {

    public String getTimeByCountry(String country) {

        DateTime dt = new DateTime();

      //  LocalTime t = new LocalTime(dt);

        return dt.getHourOfDay() + ":" + dt.getMinuteOfHour();
    }
}
