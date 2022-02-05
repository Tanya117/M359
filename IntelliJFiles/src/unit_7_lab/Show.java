package unit_7_lab;


public class Show {
    private String date;
    private double price;
    private String name;
    private int quantity;
    private String city;

    public Show(String date, double price, String name, String city, int quantity) {
        this.date = date;
        this.price = price;
        this.name = name;
        this.city = city;
        this.quantity = quantity;
    }

    public String toString(){

        return date + "\t$" + price + "\t" + quantity + "\t" + city + "\t" +  name +"\n";

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

