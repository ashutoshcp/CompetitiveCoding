package org.mine.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeUtils {

    public static Long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public static String getHumanReadableDate(String pattern, String timeZone, Long epochTime, Boolean lenient) {
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
        dateFormat.setLenient(lenient);
        return dateFormat.format(new Date(epochTime));
    }
}
