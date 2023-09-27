import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter their party affiliation menu choice
        System.out.println("Party Affiliation Menu:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your party affiliation choice: ");
        String choice = in.nextLine();

        // Determine the corresponding symbol based on the user's choice
        String symbol;

        if (choice.equalsIgnoreCase("D")) {
            symbol = "Democratic Donkey";
        } else if (choice.equalsIgnoreCase("R")) {
            symbol = "Republican Elephant";
        } else if (choice.equalsIgnoreCase("I")) {
            symbol = "Independent Person";
        } else {
            symbol = "Other";
        }

        // Display the corresponding symbol based on the user's choice
        System.out.println("You get a " + symbol + ".");

        // Close the in
        in.close();
    }
}