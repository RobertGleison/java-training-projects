package application;

import entities.ShareHolders;

import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);
        try {
            String stringDate1 = sc.nextLine();
            String stringDate2 = sc.nextLine();

            ShareHolders holders = new ShareHolders(stringDate1, stringDate2);
            holders.setInitialAnalisys();
            holders.getDescription();
        } catch (DateTimeParseException e){
            System.out.println("Erro: " + e.getMessage());

        }

        sc.close();
    }
}