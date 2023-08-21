/**
 * Rectangle
 */
class Rectangle {
public Double lenght;
public Double breadth;
public double area()
{
    return lenght*breadth;
}
public double perimeter()
{
    return 2*(lenght+breadth);
}
public boolean isSqaure()
{
    if(lenght==breadth)
    {
        return true;
    }
    else
    {
        return false;
    }
}
}
public class one {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.breadth=10.5;
        r1.lenght=10.5;
        System.out.println(r1.lenght);
        System.out.println(r1.breadth);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSqaure());
    }
}
