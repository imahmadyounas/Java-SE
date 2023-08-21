class Super
{
    public void Display()
    {
        System.out.println("Super class display");
    }
}
class Sub extends Super
{
    @Override
    public void Display()
    {
        System.out.println("Sub Class display");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Super sup =new Super();
        sup.Display();
        Sub sub = new Sub();
        sub.Display();
        Super s1 = new Sub();//Dynamic Dispatch or Super class refferrence and sub class object
        s1.Display();
    }
}
