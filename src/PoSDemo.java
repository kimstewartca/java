//-------------------------------------------------------
// Assignment 4
// Written by: Kim Stewart, Student ID: 40225973
// For COMP 248 Section T 2232 – Fall 2023
//--------------------------------------------------------

// CostLessBites Catering

// Imports the Scanner utility class
import java.util.Scanner;

public class PoSDemo {

    public static void main(String[] args) {
        // Initializes the Scanner object "input" to allow for the user's command
        Scanner scanner = new Scanner(System.in);

        PoS pos1 = new PoS();
        PoS pos2 = new PoS();
        PoS pos3 = new PoS();
        PoS pos4 = new PoS();
        PoS pos5 = new PoS();

        String commands =
                "| What would you like to do?                                                    |\n" +
                "| 1 >> See the content of all PoSs                                              |\n" +
                "| 2 >> See the content of one PoS                                               |\n" +
                "| 3 >> List PoSs with same amount of sales                                      |\n" +
                "| 4 >> List PoSs with same number of sales categories                           |\n" +
                "| 5 >> List PoSs with same amount of sales and same number of prepaid cards     |\n" +
                "| 6 >> Add a prepaid card to an existing PoS                                    |\n" +
                "| 7 >> Remove an existing prepaid card from a PoS                               |\n" +
                "| 8 >> Update the expiry date of an existing prepaid card                       |\n" +
                "| 9 >> Add sales to a PoS                                                       |\n" +
                "| 0 >> To quit                                                                  |\n" +
                "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n";

        System.out.print("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n" +
                "| Welcome to Concordia CostLessBites Catering Sales Counter Application         |\n" +
                "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n" + commands);

        int input;

        do {
            System.out.print("Please enter your choice and press <Enter>: ");
            input = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (input) {
                case 1:
                    System.out.print("Content of each PoS:\n" + "---------------------\n");
                    break;
                case 2:
                    System.out.print("Which PoS do you want to see the content of? (Enter number 0 to 4): ");
                    input = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.print("List of PoSs with the same total sales:\n");
                    break;
                case 4:
                    System.out.print("List of PoSs with the same sales categories:\n");
                    break;
                case 5:
                    System.out.print("List of PoSs with the same amount of sales and the same number of prepaid cards:");
                    break;
                case 6:
                    System.out.print("Which PoS do you want to add a prepaid card to? (Enter number 0 to 4): ");
                    input = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.print("Which PoS do you want to remove a prepaid card from? (Enter number 0 to 4): ");
                    input = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 8:
                    System.out.print("Which PoS do you want to update a prepaid card from? (Enter number 0 to 4): ");
                    input = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 9:
                    System.out.print("Which PoS do you want to add sales to? (Enter number 0 to 4): ");
                    input = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 0:
                    System.out.println("Thank you for using Concordia CostLessBites Catering Sales Counter Application!");
                    break;
                default:
                    System.out.println("Sorry, that is not a valid choice. Try again.");
            }

            // Display commands after user input, except when user enters 0 to exit
            if (input != 0) {
                System.out.print("\n" + commands);
            }

        } while (input != 0);

        // Closes the Scanner utility class after its usage to avoid memory leak
        scanner.close();
    }
}