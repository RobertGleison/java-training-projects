package org.example;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (sc) {
            System.out.print("Enter with the first parameter: ");
            int first = sc.nextInt();
            System.out.print("Enter with the second parameter: ");
            int second = sc.nextInt();
            System.out.println();

            count(first, second);

        } catch (InvalidParameterException e) {
            System.out.println("the second parameters must be greater than the first");
        }
        }

        static void count (int firstParameter, int secondParameter) throws InvalidParameterException {
            int parameterDifference = secondParameter - firstParameter;
            for (int i = 1; i <= parameterDifference; i++) {
                System.out.println("This is the number " + i);
            }
        }
}

