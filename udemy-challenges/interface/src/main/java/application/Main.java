package application;

import entities.Contract;
import services.ContractService;
import services.PaypalServices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the contracts data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/mm/yyyy): ");
        sc.nextLine();
        LocalDate date = LocalDate.parse(sc.nextLine(), dtf);
        System.out.print("Contract value: ");
        double value = sc.nextDouble();
        System.out.print("Enter the contracts installments ");
        int installments = sc.nextInt();

        Contract contract = new Contract(number, date, value);
        ContractService cs = new ContractService(new PaypalServices());
        cs.processContract(contract, installments);

        System.out.println("\nParcelas: ");
        System.out.println(contract);
        sc.close();
    }
}
