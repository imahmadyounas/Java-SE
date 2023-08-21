/**
 * InnerCylinderNew
 */
 class InnerCylinderNew {
    private int radius;
    private int height;

    public int getRadius()
    {
        return radius;
    }
    public int getHeight()
    {
        return height;
    }
    public void setRadius(int r)
    {
        radius=r;
    }
    public void setHeight(int h)
    {
        height=h;
    }

    public InnerCylinderNew()
    {
        height=0;
        radius=0;
    }
    public InnerCylinderNew(int r)
    {
        radius=r;
        height=1;
    }
    public InnerCylinderNew(int r,int h)
    {
        radius=r;
        height=h;
    }

    
}
public class CylinderNew {
    public static void main(String[] args) {
       InnerCylinderNew c1= new InnerCylinderNew();
       InnerCylinderNew c2 = new InnerCylinderNew(5);
       InnerCylinderNew c3 = new InnerCylinderNew(5, 10);
       System.out.println(c3.getHeight());

    }
}
