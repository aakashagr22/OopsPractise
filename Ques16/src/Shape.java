import java.awt.*;

public abstract class Shape {
//    6. Write a Java program to create a class called "Shape" with abstract methods
//    for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".
    public abstract double area();
    public  abstract  double perimeter();


}
class Rectangle extends Shape{

    int l;
    int b;
    Rectangle(int l,int b){
        this.l = l;
        this.b= b;
    }
    public double area(){
        return l*b;
}
public double perimeter(){
        return 2*(l+b);
}
}
class Circle extends Shape{


    int r;
    int circumstance;

    Circle(int r,int circumstance){
        this.r = r;
        this.circumstance = circumstance;

    }
    public double area(){
        return 3.14*r*r;
    }
    public double perimeter(){
        return 2*3.14*r*(circumstance);
    }
}
class Triangle extends Shape{

    int side1;
    int side2;
    int side3;
    Triangle(int side1,int side2,int side3){
        this.side1 = side1;
        this.side2= side2;
        this.side3 = side3;
    }
    public double area(){
        return 0.5*side1*side2;
    }
    public double perimeter(){
        return side1+side2+side3;
    }
}
