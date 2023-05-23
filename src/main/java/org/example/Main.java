package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // done by Ibrahim
        System.out.println("atypon training");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = scanner.nextLine();
        System.out.println("Your name is: "+name);
        // done by Ibrahim's colleague
        System.out.println("enter your age");
        double age = Integer.parseInt(scanner.nextLine());
        System.out.println("You're welcome :"+name+" and you're age is: "+age);
    }
}