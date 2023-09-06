package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();
        String[] partes = entrada.split(",");

        Transaction transaction = new Transaction(partes[0],partes[1],partes[2],Double.parseDouble(partes[3]));
        transaction.imprimir();
    }
}