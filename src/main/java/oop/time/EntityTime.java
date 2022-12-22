package oop.time;

import java.time.LocalDate;

public class EntityTime {
    private LocalDate date;

    public EntityTime(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

}
