package unit_5.marvel;

import java.sql.SQLOutput;

public class MarvelTester {
    public static void  main(String[] args){
        //Create Power object
        Power superStrength = new Power (name "Super Strength", strength: 100);
        //Create superHero object
        SuperHero hulk = new SuperHero( name: "The Hulk", superStrength);
        //Create Villian object
        Villian Loki = new Villian(name: "Loki", new Power(name:"Magic", strength: 140);

        //Create Second SuperHero object
        SuperHero superman = new SuperHero(name:"Superman", superStrength);



        System.out.println("Name:" + hulk.getName());
        System.out.println("Power:" );
        System.out.println("\tName:" + hulk.getSuperPower().getName());

    }

}
