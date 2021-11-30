package unit_5.marvel;

import java.sql.SQLOutput;

public class SuperHero {
    //Instance Variables
    private String name;
    private Power superPower;
    private int health;

//Static variables
    private static int totalNumHeroes=0;
    private static int totalHeroHealth=0;


    //Full constructor
    public SuperHero (String name, Power superPower){
        this.name = name;
        this.superPower = superPower;
        this.health=1000;
        totalNumHeroes++;
        System.out.println("Total num superheroes:" +totalNumHeroes);
        totalHeroHealth += 1000;
        System.out.println("Total hero health:" + totalHeroHealth);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * This function prints out a superhero object in an organized matter
     * @return: returns output sentence for superHero
     */

    public String toString(){
        String output = "";
        output+= "SuperHero's Name:\t\t" + name + "\n";
        output+= "SuperHero's Power:\n";
        output+= "\t- Name:\t\t" + superPower.getName() + "\n";
        output+= "\t- Strength\t" + superPower.getStrength() + "\n";

        return output;
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
