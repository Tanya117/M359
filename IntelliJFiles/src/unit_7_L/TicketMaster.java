package unit_7_L;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class TicketMaster {
    private ArrayList<Show> concert;

    public TicketMaster() {
       concert = new ArrayList<>();
    }

    public void readData() throws FileNotFoundException {
        File myFile = new File("showData.txt");
        Scanner inFile = new Scanner(myFile);
        while (inFile.hasNextLine()) {

            String date = inFile.next();
            double price = inFile.nextDouble();
            int quantity = inFile.nextInt();

            String temp = inFile.nextLine();
            int loc = temp.indexOf(",");
            String city = temp.substring(0, loc);
            String name = temp.substring(loc + 2);

            Show show = new Show(date, price, city, name, quantity);
            concert.add(show);
        }
    }

    /**
     * Prints out a Student schedule and name
     * @return formatted output for a Student object
     */
    public void sortAtoZ(ArrayList<Show> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if ((arr.get(j).getName().compareTo(arr.get(minIndex).getName())) < 0) {
                    minIndex = j;
                }
                Show temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);
            }
        }
        for (Show s: concert) {
            System.out.println(s.toString());
        }
    }

    /**
     * Prints out a Student schedule and name
     * @return formatted output for a Student object
     */
    public void sortZtoA(ArrayList<Show> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if ((arr.get(j).getName().compareToIgnoreCase(arr.get(minIndex).getName())) > 0) {
                    minIndex = j;
                }
                Show temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);
            }
        }

        for (Show s: concert) {
            System.out.println(s.toString());
        }
    }

    /**
     * Prints out a Student schedule and name
     * @return formatted output for a Student object
     */
    public void sortLowtoHigh(ArrayList<Show> arr) {
        for (int i = 1; i < arr.size(); i++) {
            Show valueToInsert = arr.get(i);
            int position = i;
            while (position > 0 && valueToInsert.getPrice() < arr.get(position - 1).getPrice()) {
                arr.set(position, arr.get(position - 1));
                position--;
            }
            arr.set(position, valueToInsert);
        }

        for (Show s: concert) {
            System.out.println(s.toString());
        }
    }

    /**
     * Prints out a Student schedule and name
     * @return formatted output for a Student object
     */
    public void sortHightoLow(ArrayList<Show> arr) {
        for (int i = 1; i < arr.size(); i++) {
            Show valueToInsert = arr.get(i);
            int position = i;
            while (position > 0 && valueToInsert.getPrice() > arr.get(position - 1).getPrice()) {
                arr.set(position, arr.get(position - 1));
                position--;
            }
            arr.set(position, valueToInsert);
        }


        for (Show s: concert) {
            System.out.println(s.toString());
        }
    }

    /**
     * Prints out a Student schedule and name
     * @return formatted output for a Student object
     */
    public ArrayList<Show> searchFor(ArrayList<Show> arr, String input) {
        ArrayList<Show> n = new ArrayList<Show>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getCity().equalsIgnoreCase(input)) {
                n.add(arr.get(i));
            }
        }
        if(n.size() != 0) {
            for (Show i : n) {
                System.out.println(i.toString());
            }
        }else{
            System.out.println("no shows here");
        }
        return n;
    }


    /**
     * Prints out a Student schedule and name
     * @return formatted output for a Student object
     */
    public ArrayList<Show> getConcert() {
        return concert;
    }

    /**
     * Prints out a Student schedule and name
     * @return formatted output for a Student object
     */
    public String toString() {
        String output = "";
        for (Show i : concert) {
            output += i;
        }
        return output;
    }

}
