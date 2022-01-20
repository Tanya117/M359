package unit_7_lab;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TicketMaster {
    private ArrayList<Show> concert = new ArrayList<>();

    public TicketMaster(ArrayList<Show> concert) {
        this.concert = concert;
    }

    public String toString() {
        String output = concert.toString();
        return output;
    }

    public void makeObject(Scanner inFile) throws FileNotFoundException{
        boolean isDone = false;
        while (!isDone){
            String date = inFile.next();
            double price = inFile.nextDouble();
            int quantity = inFile.nextInt();

            String temp = inFile.nextLine();
            int loc = temp.indexOf(",");
            String name = temp.substring(0,loc);
            String city = temp.substring(loc+2);

            Show concert = new Show(date,price, city, name, quantity);

            if(inFile.hasNextLine()) {
                inFile.nextLine();
            }
            else{
                isDone = true;
            }
        }
    }



}
