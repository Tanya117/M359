package unit_5.marvel;

public class SuperHero {
    //Instance Variables
    private String name;
    private Power superPower;


    //Full constructor
    public SuperHero (String name, Power superPower){
        this.name = name;
        this.superPower = superPower;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }

}
