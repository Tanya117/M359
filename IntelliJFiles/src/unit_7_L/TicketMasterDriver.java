package unit_7_L;

import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class TicketMasterDriver {

    //constants
    final static int CITY = 1;
    final static int AZ = 2;
    final static int ZA = 3;
    final static int LOW_HIGH = 4;
    final static int HIGH_LOW= 5;
    final static int Q = 6;

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(" ");
        System.out.println("***** Welcome to the Ticket Master Kiosk *****");
        System.out.println("You may search our shows by city as well as sort by performer and ticket price");
        System.out.println();


        TicketMaster t = new TicketMaster();
        t.readData();
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != Q) {
            choice = getTheChoice(input, t);
        }


    }

    /**
     * Prints out menu of options
     * @return formatted output for menu
     */
    public static void pMenu() { //prints out menu
        System.out.println();
        System.out.println("1. Search by City");
        System.out.println("2. Sort by Performer (A-Z)");
        System.out.println("3. Sort by Performer (Z-A)");
        System.out.println("4. Sort by Price (low - high)");
        System.out.println("5. Sort by Price (high- low)");
        System.out.println("6. Quit");
        System.out.println("Enter a value between 1 and 6:");
    }

    /**
     * Prints out organizer
     * @return formatted organizer for the shows
     */
    public static void org(){
        System.out.println("Date\t\tPrice\t\tQty\t\tCity\t\t\tPerformer");
        System.out.println("-----------------------------------------------------------");
    }


    /**
     * Runs the program displaying shows based on user input
     * @return Shows based on user's interactions
     * @Param User input, TicketMaster
     */
    public static int getTheChoice(Scanner input, TicketMaster t) {
        boolean isValidNumber = true;

        pMenu();
        int choice = 0;

        while (isValidNumber) {
            try {
                choice = input.nextInt();
                if (!(choice >= 1 && choice <= 6)) {
                    System.out.println("Invalid entry. Out of range");
                } else {
                    isValidNumber = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry, you must enter an integer between 1 and 6");
                input.next();
            }
            if (choice == CITY) {
                System.out.println("Please type in a city");
                input.nextLine();
                String val = input.nextLine();
                t.searchFor(t.getConcert(), val);
            }
            if (choice == AZ) {
                System.out.println("Sorted by Name, A-Z");
                org();
                t.sortAtoZ(t.getConcert());
            }
            if (choice == ZA) {
                System.out.println("Sorted by Name, Z-A");
                org();
                t.sortZtoA(t.getConcert());
            }
            if (choice == LOW_HIGH) {
                System.out.println("Sorted by Price, Low-High");
                org();
                t.sortLowtoHigh(t.getConcert());
            }
            if (choice == HIGH_LOW) {
                System.out.println("Sorted by Price,High-Low");
                org();
                t.sortHightoLow(t.getConcert());
            }
            if (choice == Q) {
                System.out.println("Goodbye!");
                input.close();
            }
        }
        return choice;
    }
}
