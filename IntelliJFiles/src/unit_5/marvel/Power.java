package unit_5.marvel;

public class Power {
    //instance variables
    private String name;
    private int strength;

    //Full constructor
    public Power(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

   //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


}
