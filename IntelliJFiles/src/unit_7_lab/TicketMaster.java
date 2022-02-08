package unit_7_lab;



import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TicketMaster {
    private ArrayList<Show> concert = new ArrayList<>();

    public TicketMaster(){

    }

    public String toString() {
        String output = "";

        for(Show i: concert){
            output += i+"\n";
        }
        return output;
    }
    public ArrayList<Show> getConcert(){
        return concert;
    }

    public void makeObject(Scanner inFile) throws FileNotFoundException{
        while (inFile.hasNextLine()){

            String date = inFile.next();
            double price = inFile.nextDouble();
            int quantity = inFile.nextInt();

            String temp = inFile.nextLine();
            int loc = temp.indexOf(",");
            String city = temp.substring(0,loc);
            String name = temp.substring(loc+2);

            Show show = new Show(date, price, city, name, quantity);
            concert.add(show);
        }
    }
    public void sortAtoZ(ArrayList<Show> arr){
        for(int i = 0; i<arr.size()-1; i++){
            int minIndex = i;
            for(int j = i+1; j<arr.size(); j++){
                if((arr.get(j).getName().compareTo(arr.get(minIndex).getName())) < 0){
                    minIndex = j;
                }
                Show temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);
            }
        }
    }
    public void sortZtoA(ArrayList<Show> arr){
        for(int i = 0; i<arr.size()-1; i++){
            int minIndex = i;
            for(int j = i+1; j<arr.size(); j++){
                if((arr.get(j).getName().compareToIgnoreCase(arr.get(minIndex).getName())) > 0){
                    minIndex = j;
                }
                Show temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);
            }
        }
    }
    public void sortLowtoHigh(ArrayList<Show> arr){
        for(int i = 1; i< arr.size(); i++){
            Show valueToInsert = arr.get(i);
            int position = i;
            while(position > 0 && valueToInsert.getPrice()< arr.get(position-1).getPrice()){
                arr.set(position, arr.get(position-1));
                position--;
            }
            arr.set(position, valueToInsert);
        }
    }
    public void sortHightoLow(ArrayList<Show> arr){
        for(int i = 1; i< arr.size(); i++){
            Show valueToInsert = arr.get(i);
            int position = i;
            while(position > 0 && valueToInsert.getPrice()> arr.get(position-1).getPrice()){
                arr.set(position, arr.get(position-1));
                position--;
            }
            arr.set(position, valueToInsert);
        }
    }

    public ArrayList<Show> searchFor(ArrayList<Show> arr, String input){
        ArrayList<Show> n = new ArrayList<Show>();
        for(int i = 0; i< arr.size(); i++){
            if(arr.get(i).getCity().equalsIgnoreCase(input)){
                n.add(arr.get(i));
            }
        }
        return n;
    }
}

