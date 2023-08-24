package application;

import entities.ListaTarefa;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaTarefa tasks = new ListaTarefa();

        for (int i = 0; i < 3; i++){
            System.out.println("Enter with a task to do");
            String value = sc.nextLine();
            tasks.adicionarTarefa(value);
        }
        System.out.println(tasks);
    }
}
