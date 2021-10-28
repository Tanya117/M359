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
        MarvelTester.battle(hulk, Loki);





        public static void battle (SuperHero SuperHero goodGuy;
        goodGuy, Villain SuperHero badGuy;
        badGuy){
          while (goodGuy.health() != 0 && badGuy.health()){

            boolean heroHit = Math.random() < 0.5; // [0,0.5) is a hit
            boolean villainHit = Math.random() < 0.5;// [0,0.5) is a hit

              if(heroHit){
                  badGuy.setHealth(badGuy.getHealth()- goodGuy.getSuperPower().getStrength());
                  if(badGuy.getHealth() < 0){
                      badGuy.setHealth(0);
                  }
              }
              if(villainHit){
                  goodGuy.setHealth(goodGuy.getHealth()-badGuy.getSuperPower().getStrength());
                  if(goodGuy.getHealth() < 0){
                      goodGuy.setHealth(0);
                  }
              }
        }
          if(badGuy.getHealth()==0){
              System.out.println("SuperHero won");

          }else{
              System.out.println("Villain won");
          }
    }

}

