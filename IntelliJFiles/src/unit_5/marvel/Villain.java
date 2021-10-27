package unit_5.marvel;

public class Villain {


    public class Villain{
        //instance variables
        private String name;
        private Power superPower;
        private int health;


        //Full constructor
        public Villain (String name, Power superPower){
            this.name = name;
            this.superPower = superPower;
            this.health = 1000;
        }

        /**
         * This function prints out a superhero object in an organized matter
         * @return: returns output sentence for superHero
         */

        public String toString(){
            String output = "";
            output+= "Villain's Name:\t\t" + name + "\n";
            output+= "Villain's Power:\n";
            output+= "\t- Name:\t\t" + superPower.getName() + "\n";
            output+= "\t- Strength\t" + superPower.getStrength() + "\n";

            return output;

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

    }
