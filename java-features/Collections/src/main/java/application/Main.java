package application;

import entities.ListaTarefa;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaTarefa listaTarefa = new ListaTarefa();

        for (int i = 0; i < 3; i++) {
            System.out.print(" Enter with a task: ");
            String value = sc.nextLine();
            listaTarefa.adicionarTarefa(value);
        }
        listaTarefa.obterDescricoesTarefas();

        System.out.println("Remove a task: ");
        String value2 = sc.nextLine();
        listaTarefa.removerTarefa(value2);

        listaTarefa.obterNumeroTotalTarefas();
        listaTarefa.obterDescricoesTarefas();
    }
}
