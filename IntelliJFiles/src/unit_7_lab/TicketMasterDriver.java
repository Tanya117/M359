package unit_7_lab;

import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class TicketMasterDriver {
    final int C1 = 1;
    final int c2 = 2;
    final int c3 = 3;
    final int c4 = 4;
    final int c5 = 5;
    final int c6 = 6;
    final static String TEMP_CONSTANT= "1";

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
            int choice= getInput(input);
//            if(choice.equals(TEMP_CONSTANT)){
//                System.out.println("Sorted by Name (A-Z)");
//                ticket.sortAtoZ(ticket.getConcert());
//                System.out.println(ticket);
//            }
//            else if(choice.equals("2")){
//                System.out.println("Sorted by Name (Z-A)");
//                ticket.sortZtoA(ticket.getConcert());
//                System.out.println(ticket);
//            }
//            else if(choice.equals("3")){
//                System.out.println("Sorted by Price (High-Low)");
//                ticket.sortHightoLow(ticket.getConcert());
//                System.out.println(ticket);
//            }
//            else if(choice.equals("4")){
//                System.out.println("Sorted by Price (Low-High)");
//                ticket.sortLowtoHigh(ticket.getConcert());
//                System.out.println(ticket);
//            }
//            else if(choice.equals("5")){
//                System.out.println("Pick a city");
//                String val = input.nextLine();
//                System.out.println("All concerts in " + val);
//                System.out.println(ticket.searchFor(ticket.getConcert(), val));
//            }
//            else if(choice.equals("6")){
//                System.out.println("Thank you.");
//                break;
//            }
//            else{
//                System.out.println(" Please enter a valid option\n");
//            }
        }
    }
    public static int getInput(Scanner input){
        while(true) {
            System.out.println("1. Sort by A-Z\n2. Sort by Z-A\n" +
                    "3. Sort by Price(High-Low)\n4. Sort by Price(Low-High)\n" +
                    "5. Sort by Arena\n6. Quit ");
            int choice = 0;
            try {
                choice = input.nextInt();
                if(choice>=1&& choice<=6){
                    return choice;
                }else{
                    System.out.println("Error! Please enter a valid number between 1 and 6");
                }
            } catch (Exception e) {
                System.out.println("Error! Please enter a valid number between 1 and 6");
                input.nextLine();
            }
        }
    }
}













