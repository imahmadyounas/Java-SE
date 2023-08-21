abstract class Shape {
//has no properties cause its going to be an abstract class
abstract double perimeter();
abstract double area();
}

class Circle extends Shape{
    public double radius;
    public Circle()
    {
        radius=10;
    }
    public void setRadius(double r)
    {
        this.radius=r;
    }
     public double perimeter()
     {
        return 2*Math.PI*radius;
     }
     public double area()
     {
        return Math.PI*radius*radius;
     }
}
class Rectangle extends Shape {
    public double length;
    public double breadth;
 public double perimeter()
 {
    return 2*(length+breadth);
 }
 public double area()
 {
    return length*breadth;
 }
}
public class Abstract {
public static void main(String[] args) {
    Rectangle r= new Rectangle();
    r.breadth=10;
    r.length=10;
    System.out.println(r.area());
    Shape s =r;
    System.out.println(s.area());
    System.out.println("Reactanlge data below:");
    Shape s1 = new Circle();
    System.out.println(s1.area());
    //s1.radius and s1.setRadius not possible cuase of the dynamic dispatch and super class reffrence
    Circle c= new Circle();
    c.setRadius(30);
    System.out.println(c.area());
    
    
}
    
}