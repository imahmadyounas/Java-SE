/**
 * Tv
 */
class Tv {
    public void switchOn()
    {
        System.out.println("Tv is Switched On!");
    }
    public void changeChannel()
    {
        System.out.println("Tv Changed Channel!");
    }
}

class SmartTv extends Tv {
    public void switchOn()
    {
        System.out.println("Smart Tv is Switched On!");
    }
    public void changeChannel()
    {
        System.out.println(" Smart Tv Changed Channel!");
    }
    public void isBrowsing()
    {
        System.out.println(" Smart Tv is Browsing");
    }    
}
public class DynamicDispatch {
    public static void main(String[] args) {
    Tv t= new Tv();
    t.switchOn();
    t.changeChannel();
    SmartTv sTv = new SmartTv();
    sTv.switchOn();
    sTv.changeChannel();
    sTv.isBrowsing();
    System.out.println("Below Dynamic Dispacth");
    Tv t1 = new SmartTv();//Dynamic Dispatch
    t1.switchOn();
    t1.changeChannel();
    //t1.isBrowsing(); cant call this method becasue reffernce is of type tv and the method belongs to SmartTv
    }
}
