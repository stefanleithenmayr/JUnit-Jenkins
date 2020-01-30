package at.htl.junit5.test.assumptions;

import org.apache.tomcat.jni.Local;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class HolidayServiceTest {

    @Test
    void checkHolidayTimeZone() {

        TimeZone tzone = TimeZone.getDefault();
        // Assume that the timezone is China Standard Time
        assumeTrue(tzone.getDisplayName().equals("Mitteleuropäische Zeit"));

        // Test IsToTravel method
        HolidayService holidayService = new HolidayService();
        assertTrue(holidayService.IsToTravel());
    }

    @Test
    void checkHolidayLocale() {
        // Assume that the current locale is Germany
        Locale currentLocale = Locale.getDefault();
        Locale locale = new Locale("de", "AT");
        assumeTrue(currentLocale.equals(locale));

        // Test IsToTravel method
        HolidayService holidayService = new HolidayService();
        assertTrue(holidayService.IsToTravel());
    }

    @Test
    public void checkWorkDay() {

        HolidayService holidayService = new HolidayService();
        assumeTrue(holidayService.checkHoliday());

        // Test doSchedule method
        assertTrue(holidayService.checkWorkDay());
    }
}