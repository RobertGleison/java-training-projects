package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;
    List<Installment> installments = new ArrayList();

    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public Double getTotalValue() {
        return this.totalValue;
    }

    public List<Installment> getInstallments() {
        return this.installments;
    }

    public String toString() {
        String line = "";

        Installment installment;
        for (Iterator var2 = this.installments.iterator(); var2.hasNext(); line = line + installment + "\n") {
            installment = (Installment) var2.next();
        }

        return line;
    }
}