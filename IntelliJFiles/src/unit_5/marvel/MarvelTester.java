package unit_5.marvel;

import java.sql.SQLOutput;

public class MarvelTester {
    public static void  main(String[] args){
        //Create Power object
        Power superStrength = new Power (name "Super Strength", strength: 100);
        //Create superHero object
        SuperHero hulk = new SuperHero( name: "The Hulk", superStrength);
        //Create Villian object
        Villain Loki = new Villain(name: "Loki", new Power(name:"Magic", strength: 140);

        //Create Second SuperHero object
        SuperHero superman = new SuperHero(name:"Superman", superStrength);



        System.out.println("Name:" + hulk.getName());
        System.out.println("Power:" );
        System.out.println("\tName:" + hulk.getSuperPower().getName());



        //Battle between Loki and Hulk
        //Set up if else else if statements comparing Loki and Hulk's power strength
        if(Loki.getSuperPower().getStrength()> hulk.getSuperPower().getStrength()){
            System.out.println("Loki wins");
        }else if(Loki.getSuperPower().getStrength()< hulk.getSuperPower().getStrength()){
            System.out.println("hulk wins");
        }else{
            System.out.println("tie");
        }

        public static void battle(SuperHero goodGuy, Villain badGuy){
            boolean heroHit = Math.random() < 0.5; // [0,0.5) is a hit
            boolean villainHit = Math.random() < 0.5;// [0,0.5) is a hit
    }

}
