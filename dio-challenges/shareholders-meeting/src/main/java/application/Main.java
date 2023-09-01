package application;

import entities.ShareHolders;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String stringDate1 = sc.nextLine();
        String stringDate2 = sc.nextLine();

        ShareHolders holders = new ShareHolders(stringDate1,stringDate2);
        holders.getDescriptions();

    sc.close();
    }
}