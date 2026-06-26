//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    6. Write a Java program to create a class called "Shape" with abstract methods
//    for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".
    Rectangle rc = new Rectangle(3,5);
    System.out.println("Area: "+rc.area() + " Perimeter: " +rc.perimeter());

    Circle c = new Circle(3,5);
    System.out.println("Area: "+c.area() + " Perimeter: " +c.perimeter());

    Triangle t = new Triangle(3,5,6);
    System.out.println("Area: "+t.area() + " Perimeter: " +t.perimeter());

}
