package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int number = sc.nextInt();
        sc.nextLine();
        double balance = sc.nextDouble();
        double interest = sc.nextDouble();

        BankAccount b = new SavingsAccount(name, number, balance,interest);
        System.out.println(b);
    }
}

class BankAccount {
    public String name;
    public int number;
    public double balance;

    public BankAccount(String name, int number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return
                "Informacoes:\n" +
                        "Conta: " + number +
                        "\nTitular: " + name +
                        String.format("\nSaldo: R$ %.1f", balance);
    }
}

class SavingsAccount extends BankAccount {
    public double interest;

    public SavingsAccount(String name,int number , double balance, double interest) {
        super(name, number, balance);
        this.interest = interest;
    }

    @Override
    public String toString() {
        return
                "Conta Poupanca:\n" +
                        name + "\n" +
                        number + "\n" +
                        String.format("Saldo: R$ %.1f", balance) +
                        "\n" + "Taxa de juros: " + String.format("%.1f", interest) + "%";
    }
}