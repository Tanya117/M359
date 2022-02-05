package unit_7_lab;

import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println(" ");
        System.out.println("***** Welcome to the Ticket Master Kiosk *****");
        System.out.println("You may search our shows by city as well as sort by performer and ticket price");
        System.out.println(" ");
        File myFile = new File("showData.txt");
        Scanner fileIn = new Scanner(myFile);
        TicketMaster ticket = new TicketMaster();
        ticket.makeObject(fileIn);
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("1. Sort by A-Z\n2. Sort by Z-A\n" +
                    "3. Sort by Price(High-Low)\n4. Sort by Price(Low-High)\n" +
                    "5. Sort by Arena\n6. Quit ");
            String choice = input.nextLine();
            if(choice.equals("1")){
                System.out.println("Sorted by Name (A-Z)");
                ticket.sortAtoZ(ticket.getConcert());
            }
            else if(choice.equals("2")){
                System.out.println("Sorted by Name (Z-A)");
                ticket.sortZtoA(ticket.getConcert());
            }
            else if(choice.equals("3")){
                System.out.println("Sorted by Price (High-Low)");
                ticket.sortHightoLow(ticket.getConcert());
            }
            else if(choice.equals("4")){
                System.out.println("Sorted by Price (Low-High)");
                ticket.sortLowtoHigh(ticket.getConcert());
            }
            else if(choice.equals("5")){
                System.out.println("Pick a city");
                String val = input.nextLine();
                System.out.println("All concerts in " + val);
                System.out.println(ticket.searchFor(ticket.getConcert(), val));
            }
            else if(choice.equals("6")){
                break;
            }
            else{
                System.out.println("Enter valid option");
            }
        }
    }
}













