package org.example;

import java.awt.image.BandCombineOp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double balance = sc.nextDouble();

        BankAccount b = new BankAccount(number, name, balance);
        System.out.println(b);



    }
}

class BankAccount{
        public int number;
        public String name;
        public double balance;

    public BankAccount(int number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return
                "Informacoes:\n" +
                "Conta: " + number +
                "\nTitular: " + name +
                String.format("\nSaldo: R$ %.1f",balance);
    }
}