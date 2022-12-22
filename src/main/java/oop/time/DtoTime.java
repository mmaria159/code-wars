package oop.time;

import java.time.LocalDate;

public class DtoTime {
    private final int day;
    private final int month;
    private final int year;

    public DtoTime(int day, int month, int year) {
        if (day < 0 || day > 31) throw new IllegalArgumentException("Day can't be less than 0 or greater than 31");
        if (month < 0 || month > 12) throw new IllegalArgumentException("Month can't be less than 0 or greater than 12");
        if (year < 1800 || year > 2300) throw new IllegalArgumentException("Year can't be less than 1800 or greater than 2300");
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public LocalDate getDate() {
        return LocalDate.of(year, month, day);
    }
}
