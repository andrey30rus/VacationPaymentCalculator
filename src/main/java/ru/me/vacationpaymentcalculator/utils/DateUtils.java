package ru.me.vacationpaymentcalculator.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class DateUtils {

    private static boolean isWeekend(LocalDate date) {
        DayOfWeek dayOfWeak = date.getDayOfWeek();

        return dayOfWeak == DayOfWeek.SATURDAY || dayOfWeak == DayOfWeek.SUNDAY;
    }

    public static int calculateBusinessDaysBetween(LocalDate start, LocalDate end, List<LocalDate> holidays) {
        int businessDays = 0;
        while (!start.isAfter(end)) {
            if (!isWeekend(start) && !holidays.contains(start)) {
                businessDays++;
            }
            start = start.plusDays(1);
        }
        return businessDays;
    }
}
