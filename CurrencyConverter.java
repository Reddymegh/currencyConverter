package atm;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount;
        int choice;

        System.out.println("🌐 Welcome to Currency Converter");
        System.out.println("Enter amount in INR: ");
        amount = scanner.nextDouble();

        System.out.println("\nConvert INR to:");
        System.out.println("1. USD (US Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.println("4. JPY (Japanese Yen)");
        System.out.print("Enter your choice (1-4): ");
        choice = scanner.nextInt();

        convertCurrency(amount, choice);
        scanner.close();
    }

    public static void convertCurrency(double inr, int option) {
        double converted;
        switch (option) {
            case 1:
                converted = inr * 0.012; // INR to USD
                System.out.printf("₹%.2f INR = $%.2f USD\n", inr, converted);
                break;
            case 2:
                converted = inr * 0.011; // INR to EUR
                System.out.printf("₹%.2f INR = €%.2f EUR\n", inr, converted);
                break;
            case 3:
                converted = inr * 0.0095; // INR to GBP
                System.out.printf("₹%.2f INR = £%.2f GBP\n", inr, converted);
                break;
            case 4:
                converted = inr * 1.74; // INR to JPY
                System.out.printf("₹%.2f INR = ¥%.2f JPY\n", inr, converted);
                break;
            default:
                System.out.println("Invalid choice. Please select between 1 and 4.");
        }
    }
}
