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
        return this.date;
    }

    public Double getAmount() {
        return this.amount;
    }

    public String toString() {
        String var10000 = this.date.format(this.dtf);
        return var10000 + " - " + String.format("%.2f", this.amount);
    }
}
