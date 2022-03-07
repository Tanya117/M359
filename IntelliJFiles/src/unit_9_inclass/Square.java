package unit_9_inclass;

public class Square extends Shape {
    private int sideLength;

    public Square(String color,int sideLength) {
        super(color,sideLength);
        this.sideLength=sideLength;
    }

    public String toString(){
        return "Color:\t";
    }
}
