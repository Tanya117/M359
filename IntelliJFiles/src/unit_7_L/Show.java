package unit_7_L;

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

    /**
     * Prints out a formatted show object
     * @return formatted output for a Show object
     */
    public String toString() {
        String output = date + "\t$" + price + "\t\t" + quantity + "\t\t" + city;
        int rem = 15 - city.length();
        for (int i = 0; i < rem; i++) {
            output += " ";
        }
        output += name;
        return output;
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
}