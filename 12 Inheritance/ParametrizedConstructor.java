/**
 * Rectangle
 */
class Rectangle
{
    public int l;
    public int b;
    public Rectangle()
    {
        l=b=1;
    }
    public Rectangle(int l, int b)
    {
        this.b=b;
        this.l=l;
    }
      public Rectangle(int l, int b,int c)
    {
        this.b=b;
        this.l=l;
    }
    public Rectangle(short l, short b)
    {
        this.b=b;
        this.l=l;
    }
    
}
/**
 * Cuboid
 */
class Cuboid extends Rectangle{
    public int h;
    public Cuboid ()
    {
        super(2,4);
        h=1;
    }
    public Cuboid(short l,short b,int h)
    {
        super(l,b);
        this.h=h;
    }
    public Cuboid(int l,int b,int c,int h)
    {
        super(l,b,c);
        this.h=h;
    }
    public int area()
    {
        return l*b*h;
    }

    
}
/**
 * ParametrizedConstructor
 */
public class ParametrizedConstructor {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid();
        System.out.println(c1.area());
        short a=5,b=10,c=10;
        Cuboid c2= new Cuboid(a, b, c,1);
        System.out.println(c2.area());
        Cuboid c3= new Cuboid();
        System.out.println(c3.area());

    }
}