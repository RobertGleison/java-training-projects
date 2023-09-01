package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class ShareHolders {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String date1;
    private String date2;
    private LocalDate beginnigDate;
    private LocalDate finalDate;

    List<Analisys> analisys = new ArrayList<>();

    public void setInitialAnalisys() {
        analisys.add(new Analisys("01/01/2023", "Analise de Desempenho Financeiro"));
        analisys.add(new Analisys("15/02/2023", "Analise de Riscos e Exposicoes"));
        analisys.add(new Analisys("31/03/2023", "Analises Corporativas"));
        analisys.add(new Analisys("01/04/2023", "Analise de Politicas e Regulamentacoes"));
        analisys.add(new Analisys("15/05/2023", "Analise de Ativos"));
        analisys.add(new Analisys("30/06/2023", "Analise de Inovacao e Tecnologia"));
    }

    public ShareHolders(String date1, String date2) {
        this.date1 = date1.trim();
        this.date2 = date2.trim();
        this.beginnigDate = LocalDate.parse(date1, dtf);
        this.finalDate = LocalDate.parse(date2, dtf);
    }

    public String getDate1() {
        return date1;
    }

    public String getDate2() {
        return date2;
    }

    public LocalDate getBeginnigDate() {
        return beginnigDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public void addAnalisys(String date, String description) {
        analisys.add(new Analisys(date, description));
    }

    public void removeAnalisys(String date, String description) {
        analisys.remove(new Analisys(date, description));
    }

    public void getDescription() {
        for (Analisys a : analisys) {
            if ((LocalDate.parse(a.getDate(),dtf).isAfter(getBeginnigDate()) && LocalDate.parse(a.getDate(),dtf).isBefore(getFinalDate()) || LocalDate.parse(a.getDate(),dtf).equals(getBeginnigDate()) || LocalDate.parse(a.getDate(),dtf).equals(getFinalDate()))) {
                System.out.println(a.getDescription());
            }
        }

    }


}
