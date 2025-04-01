package org.tnsif.capgemini.c2tc.ScannerClass_BufferCLass;

import java.util.Scanner;

public class ScannerAllMethod {

    public static void main(String[] args) {
        // Create a scanner object
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.println("Enter your name");
        String name = scan.nextLine();
        
        System.out.println("Enter your age");
        int age = scan.nextInt();
        
        // Clear the buffer
        scan.nextLine(); // To consume the newline character
        
        System.out.println("Enter your Height");
        float height = scan.nextFloat();
        
        // Clear the buffer
        scan.nextLine(); // To consume the newline character
        
        System.out.println("Are you a student (true/false)");
        boolean isStudent = scan.nextBoolean();
        
        // Clear the buffer
        scan.nextLine(); // To consume the newline character
        
        System.out.println("Enter your Aadhar number");
        long aadhar = scan.nextLong();
        
        // Clear the buffer
        scan.nextLine(); // To consume the newline character
        
        System.out.println("Enter your favorite teacher");
        String teacher = scan.nextLine();
        
        System.out.println("Enter your hobby");
        String hobby = scan.nextLine();
        
        System.out.println("Enter your CGPA");
        double cgpa = scan.nextDouble();
        
        System.out.println("Enter your daily reading time in minutes");
        byte readingTime = scan.nextByte();
        
        System.out.println("Enter number of siblings you have");
        short siblings = scan.nextShort();
        
        // Print the collected information
        System.out.println("Student information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Aadhar: " + aadhar);
        System.out.println("Favorite Teacher: " + teacher);
        System.out.println("Hobby: " + hobby);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Reading Time: " + readingTime + " minutes");
        System.out.println("Siblings: " + siblings);
        
        // Close the scanner
        scan.close();
    }
}
