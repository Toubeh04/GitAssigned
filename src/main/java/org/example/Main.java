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
        // Done by Ibrahim's collegue
        if (favSport == "basketball" && height >= 190){
            System.out.println("Since you're tall and like basketball, do you play it? (answer yes or no please): ");
            String ans = scanner.nextLine();
            ans.toLowerCase();
            if(ans == "yes")
                System.out.println("that's impressive, good job!");
            else
                System.out.println("No problem, you're still tall anyway!");
        }
        else{
            System.out.println("do you wish you were tall so you can play it? (answer yes or no please): ");
            String ans = scanner.nextLine();
            ans.toLowerCase();
            if(ans == "yes")
                System.out.println("It's okay, you can excel somewhere else! ");
            else
                System.out.println("Yeah it's a good sport to watch!");
        }

    }
}