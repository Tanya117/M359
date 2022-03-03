package unit_9_inclass;

public class Rectangle extends Shape{
    private int width,height;

    public Rectangle(String color, int width, int height) {
        super(color,4);
        this.height=height;
        this.width=width;
    }
    @Override
    //partial Override
    public String toString(){
        return super.toString()+"\nHeight\t:"+height+"\nWidth:\t"+width;
    }

}
