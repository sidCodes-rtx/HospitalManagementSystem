package SE.HospitalMgmtSystem;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Predefined login credentials
        String correctUsername = "admin";
        String correctPassword = "admin123";

        System.out.println("=================================");
        System.out.println("     HOSPITAL MANAGEMENT SYSTEM");
        System.out.println("=================================");

        // Ask the user to enter username
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        // Ask the user to enter password
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Validate login credentials
        if (username.equals(correctUsername) &&
            password.equals(correctPassword)) {

            System.out.println("\nLogin Successful!");
            System.out.println("Welcome to Hospital Management System");

        } else {

            System.out.println("\nInvalid Username or Password!");
            System.out.println("Please try again.");

        }

        sc.close();
    }
}