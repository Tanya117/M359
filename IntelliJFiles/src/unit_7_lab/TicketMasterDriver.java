package unit_7_lab;

import unit_7_lab.Show;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("How would you like to sort the tickets?");

        System.out.println("1. Performer A-Z");
        System.out.println("2. Performer Z-A");
        System.out.println("3. Price low-high");
        System.out.println("4. Price high-low");
        System.out.println("5. city");
        System.out.println("6. quit");

        String response = input.nextLine();
        if (response.equalsIgnoreCase("1")) {
            sortByAz;
        }

    }

}
