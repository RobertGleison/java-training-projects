package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.print("Enter full file Path: ");
        String filePath = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                double salary = Double.parseDouble(fields[2]);
                Employee emp = new Employee(name, email, salary);
                employees.add(emp);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.printf("Email of people whose salary is more than %.2f: %n%n", salary);
        List<Employee> filteredEmployees = employees.stream().filter(e -> e.getSalary() >salary).collect(Collectors.toList());
        filteredEmployees.forEach(System.out::println);
        double sum = 0.0;
        sum = employees.stream().filter(e->e.getName().charAt(0) == 'M').mapToDouble(Employee::getSalary).sum();
        System.out.print("Sum of salary of people whose name starts with 'M': " + sum);
    }


}

