package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate date;
    private Double amount;

    public Installment(LocalDate date, Double amount) {
        this.date = date;
        this.amount = amount;
    }

    public Installment() {
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getAmount() {
        return amount;
    }

    public String toString(){
        return date.format(dtf) + " - " + String.format("%.2f",amount);
    }
}
