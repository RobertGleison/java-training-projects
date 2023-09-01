package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Analisys {

    private String date;
    private String description;


    public Analisys(String date, String description) {
        this.date = date;
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
