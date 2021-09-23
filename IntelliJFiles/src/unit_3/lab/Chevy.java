package unit_3.lab;

public class Chevy {
    private int year;
    private int mileage;
    private double fuelE;
    private int price;
    private String model;
    private String color;
    private boolean luxury;
    private boolean WD;
    private boolean sports;
    final String VEHICLE = "Chevrolet";
    final double TAX_RATE = 12.2;
    final 


//Default constructor
    public Chevy(){
        year = 2021;
        mileage = 0;
        fuelE = 35;
        price = 1600;
        model = "Trax";
        color = "white";
        luxury = false;
        WD = false;
        sports = false;
    }
//Constructor
    public Chevy(int aYear, int aMileage, double AfuelE, int price, String aModel, String aColor, boolean isLuxury, boolean isWD, boolean isSport){
        year = aYear;
        mileage = aMileage;
        fuelE = AfuelE;
        model = aModel;
        color = aColor;
        luxury = isLuxury;
        WD = isWD;
        sports = isSport;
    }

//Getters and Setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getFuelE() {
        return fuelE;
    }

    public void setFuelE(double fuelE) {
        this.fuelE = fuelE;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLuxury() {
        return luxury;
    }

    public void setLuxury(boolean luxury) {
        this.luxury = luxury;
    }

    public boolean isWD() {
        return WD;
    }

    public void setWD(boolean WD) {
        this.WD = WD;
    }

    public boolean isSports() {
        return sports;
    }

    public void setSports(boolean sports) {
        this.sports = sports;
    }





}
