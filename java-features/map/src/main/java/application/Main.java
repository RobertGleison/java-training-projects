package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> votes = new TreeMap<>();

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null ){
                String[] fields = line.split(",");
                votes.put(fields[0],Integer.valueOf(fields[1]));
                line = br.readLine();
            }


        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}