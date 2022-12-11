package test;

import main.Calendar;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;

class TestCalendar {

    GregorianCalendar gc = new GregorianCalendar();

    @ParameterizedTest
    @ValueSource(ints = {1904, 1908, 1912, 1992, 1996})
    public void Should_check_if_year_is_leap_also_in_gregorian(int year) {

        Calendar cal = new Calendar(year);

        assertEquals(gc.isLeapYear(year), cal.isLeapYear());

    }

    @ParameterizedTest
    @ValueSource(ints = {1804, 1908, 1912, 2001, 2020})
    public void acceptableValueTest(int year) {

        Calendar cal = new Calendar(year);

        if (year >= 1900 && year < 2000){
            assertEquals(gc.isLeapYear(year), cal.isLeapYear());
        } else {
            assertFalse(cal.isLeapYear());
        }


    }


}