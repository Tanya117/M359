package unit_9_inclass;

public class Circle extends Shape{
    private int radius;

    public Circle(String color, int radius){
        super(color,0);
        this.radius=radius;
    }
    public String toString(){
        return super.toString()+"\nRadius:\t"+radius;
    }
    @Override
    //complete Override
    public double calcArea(){
        return 3.14*(radius*radius);
    }
}

