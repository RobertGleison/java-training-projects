package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file Path: ");
        String filePath = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            List<Employee> employees = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.printf("Email of people whose salary is more than %.2f: %n", salary);

            List<String> emails = employees.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            emails.forEach(System.out::println);

            double sum = employees.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x, y) -> x + y);


            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", sum);
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}




