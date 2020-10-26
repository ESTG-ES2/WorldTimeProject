package WorldTime;
import org.joda.time.*;
public class WorldTime {

    public WorldTime(){

    }

    public String getTimeByCountry(String country){
        long hh;
        long mm;

        DateTimeZone tz = DateTimeZone.forID(country);
        DateTime dt = new DateTime(tz);

        hh = dt.hourOfDay().get();
        mm= dt.minuteOfHour().get();

        return "" + hh+ ":"+mm;


    }
}
