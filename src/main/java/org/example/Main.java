package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Done by Ibrahim
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your height (in cm): ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter your favourite sport: ");
        String favSport = scanner.nextLine();


    }
}