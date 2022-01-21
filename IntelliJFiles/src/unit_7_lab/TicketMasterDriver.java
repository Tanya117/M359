package unit_7_lab;

import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException{
        File myFile = new File("showData.txt");
        Scanner fileIn = new Scanner(myFile);
        TicketMaster ticket = new TicketMaster();
        ticket.makeObject(fileIn);
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("How would you like to sort the tickets?");

        while(true){
            System.out.println("1. Sort by A-Z\n2. Sort by Z-A\n" +
                    "3. Sort by Price(High-Low)\n4. Sort by Price(Low-High)\n" +
                    "5. Sort by Arena\n6. Quit ");
            String choice = input.nextLine();
            if(choice.equals("1")){
                System.out.print(ticket);
            }
            else if(choice.equals("2")){
                System.out.print(ticket);
            }
            else if(choice.equals("3")){
                System.out.print(ticket);
            }
            else if(choice.equals("4")){
                System.out.print(ticket);
            }
            else if(choice.equals("5")){
                System.out.print(ticket);
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












