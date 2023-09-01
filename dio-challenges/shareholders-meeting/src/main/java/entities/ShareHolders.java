package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class ShareHolders {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String date1;
    private String date2;
    private LocalDate beginnigDate = LocalDate.parse(date1, dtf);
    private LocalDate finalDate = LocalDate.parse(date2, dtf);

    public ShareHolders(String date1, String date2) {
        this.date1 = date1;
        this.date2 = date2;
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

    public List<Analisys> getAnalisys(String date1, String date2){
        List<Analisys> analisys = new ArrayList<>();

        analisys.add(new Analisys(LocalDate.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
        analisys.add(new Analisys(LocalDate.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
        analisys.add(new Analisys(LocalDate.parse("31/03/2023"), "Analises Corporativas"));
        analisys.add(new Analisys(LocalDate.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
        analisys.add(new Analisys(LocalDate.parse("15/05/2023"), "Analise de Ativos"));
        analisys.add(new Analisys(LocalDate.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));

        return analisys;
    }

    public void getDescriptions(){


    }

}
