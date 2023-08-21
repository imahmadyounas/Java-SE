class Rectangle
{
    public int l;
    public int b;
    public int x=10;
    public Rectangle(int l, int b)
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
    public int x=20;
    public Cuboid(int l,int b,int h)
    {
        super(l,b);
        this.h=h;
    }
    public void display()
    {
        System.out.println("Childs x:"+x);
        System.out.println("Inherited from Paret x:"+super.x);
        System.out.println("this.x:"+this.x);
        System.out.println("Breadth:"+this.b);
    }   
}
public class ThisAndSuper {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid(10, 10, 10);
        c1.display();
        
    }
}
