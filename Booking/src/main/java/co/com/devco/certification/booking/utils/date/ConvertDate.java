package co.com.devco.certification.booking.utils.date;

import co.com.devco.certification.booking.utils.enums.Moths;

public class ConvertDate {
    private static String mothYear;
    private static String day;

    public static String getDay(String date) {
        day = date.split("-")[0];
        return day;
    }

    public static String getMothYear(String date) {
        mothYear = date.split("-")[1];
        return Moths.valueOf(mothYear.toUpperCase()).moth().toLowerCase() + " " + date.split("-")[2];
    }
}
