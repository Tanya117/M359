package unit_9_inclass;

import com.sun.org.apache.bcel.internal.util.ClassQueue;

import java.sql.SQLOutput;

public class ShapeDriver {
    public static void main(String [] args){
        Circle myCirc= new Circle("Red", 8247);
        Rectangle myRect = new Rectangle("Purple",82,47);

        System.out.println(myCirc);
        System.out.println(myRect);
    }
}
