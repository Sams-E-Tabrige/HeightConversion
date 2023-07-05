package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variable declaration
        String name;
        double HeightInch, HeightCm;

        // Input

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name?");
        name = input.nextLine();
        System.out.println("What is your height in inches?");
        HeightInch = input.nextDouble();
        input.close();

        // Calculations to convert inches to cm's
        HeightCm = HeightInch * 2.54;

        // Output the users height in cm
        System.out.println(name+ ", your height in cm is " +HeightCm);
    }
}