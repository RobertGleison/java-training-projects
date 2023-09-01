package entities;

import java.time.LocalDate;

public class Analisys {
    private LocalDate date;
    private String description;

    public Analisys(LocalDate date, String description) {
        this.date = date;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
