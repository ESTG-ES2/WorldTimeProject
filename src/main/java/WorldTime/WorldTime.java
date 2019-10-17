package WorldTime;

import org.joda.time.*;


public class WorldTime {

    public WorldTime() {
    }

    public String getTimeByCountry(String country) {

        if (country.compareToIgnoreCase("Japan") == 0) {
            DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
            LocalTime dt = new LocalTime(zone);
            return dt.toString("HH:mm");
        } else if(country.compareToIgnoreCase("America/New_York") == 0){
            DateTimeZone zone = DateTimeZone.forID("America/New_York");
            LocalTime dt = new LocalTime(zone);
            return dt.toString("HH:mm");
        }
        else {
            System.out.println("País ainda não foi adicionado ao sistema.");
            return null;
        }

    }

}