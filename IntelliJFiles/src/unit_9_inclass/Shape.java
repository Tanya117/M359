package unit_9_inclass;

public class Shape {
    private String color;
    private int numSides;

    public Shape(String color, int numSides){
        this.color= this.color;
        this.numSides= numSides;
    }

    public String toString(){
        return("Color\t"+color+"\nNumSides:\t"+numSides);
    }

    public double calcArea(){
        return 0;
    }

    //getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }
}
