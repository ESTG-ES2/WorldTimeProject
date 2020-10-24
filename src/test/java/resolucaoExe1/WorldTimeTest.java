/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package resolucaoExe1;

import org.junit.jupiter.api.*;
import java.time.Instant;
import java.time.Clock;
import java.time.ZoneOffset;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;

public class WorldTimeTest {
	private WorldTime wt;

	@BeforeEach
    public void setUp() {
	    //Arrange
         wt = new WorldTime();
        //Overriding System Time for Testing in Java
        DateTime date = new DateTime(2019, 10, 22, 10, 5, 0, 0);
        DateTimeUtils.setCurrentMillisFixed(date.getMillis());
    }

    @Test
    public void testGetTimeByCountryFormat() {
	    //Arrange
    	String validationPattern="[0-9]?[0-9]:[0-9]?[0-9]";
    	//Act
        boolean expected = wt.getTimeByCountry("America/New_York").matches(validationPattern);
        //Assert
        Assertions.assertTrue(expected, "Wrong format");
    }
}
