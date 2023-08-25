package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> votes = new TreeMap<>();
        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                if (fields.length >= 2) {
                    String candidate = fields[0];
                    int candidateVotes = Integer.parseInt(fields[1]);
                    if (!votes.containsKey(fields[0])) {
                        votes.put(fields[0], Integer.valueOf(fields[1]));
                    } else {
                        int currentVotes = votes.get(candidate);
                        int newVotes = currentVotes + candidateVotes;
                        votes.put(candidate, newVotes);
                    }
                }
                line = br.readLine();
            }

            System.out.println();
            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}