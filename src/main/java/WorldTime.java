import org.joda.time.DateTimeZone;

public class WorldTime {

    public String getTimeByCountry(String country){

        DateTimeZone dt = DateTimeZone.forID("Europe/London");

        return dt.toString();

    }
}
