package resolucaoExe1;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * WorldTime is the class responsible for handling time format
 *
 * @author João Cunha
 * @version 0.1
*/
public class WorldTime {

	/**
	 * A static method that prints the time of a certain timezone
	 * in the HH:MM format
	 *
	 * @param timezone the timezone from the DateTimeZone from the
	 *				   joda-time lib.
	 * @return string with hours with the format (HH:MM)
	 * @see WorldTime
	*/
	public String getTimeByCountry(String timezone) {
		long hh = 0, mm = 0;
		DateTime date = new DateTime(DateTimeZone.forID(timezone));
		hh = date.hourOfDay().get();
		mm = date.minuteOfHour().get();
		return "" + hh + ":" + mm;
	}
}
