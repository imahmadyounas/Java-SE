/**
 * Cylinder
 */
class Cylinder{
public double radius;
public double height;
public double lidArea()
{
    return Math.PI*radius*radius;
}
public double totalSurfaceArea()
{
    return 2*lidArea()+circumference();
}
public double circumference()
{
    return 2*Math.PI*radius;
}
public double volume()
{
    return lidArea()*height;
}    
}
//or public class Cylinder and the above class can be named as class InnerCylinder
public class CylinderTest {

    public static void main(String[] args) {
    Cylinder c1= new Cylinder();
    c1.height=10.5;
    c1.radius=5.5;
    System.out.println(String.format("%.2f", c1.circumference()));//to limit the decimal values to upto two places only
    System.out.println(c1.totalSurfaceArea());
    System.out.println(c1.volume());
    System.out.println(c1.lidArea());

    }
}