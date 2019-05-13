package org.mine.date;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateTimeUtilsTest {

    private DateTimeUtils dateTimeUtils;

    @Before
    public void setUp() throws Exception {
        dateTimeUtils = new DateTimeUtils();
    }

    @Test
    public void getCurrentTime() {
        Long currentTime = DateTimeUtils.getCurrentTime();
        System.out.println(currentTime);
        assertNotEquals(null, currentTime);
    }

    @Test
    public void getHumanReadableDate() {
        String readableDate = DateTimeUtils.getHumanReadableDate("dd/MM/yyyy hh:mm:ss", "IST",
                DateTimeUtils.getCurrentTime(), false);
        System.out.println(readableDate);
        assertNotEquals(null, readableDate);
    }
}