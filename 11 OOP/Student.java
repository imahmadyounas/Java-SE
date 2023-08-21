/**
 * InnerStudent
 */
class InnerStudent
{
    //properties
public int rNo;
public String name;
public String course;
public int m1,m2,m3;

//Methods
public int total()
{
    return m1+m2+m3;
}
public float average()
{
    return (float)(m1+m2+m3)/3;
}
public char grade()
{
    if(average()>=70)
    {
        return 'A';
    }
    else
    {
        return 'B';
}    
}
//if toString method is there u can directly call the object.
public String toString()
{
    return "Details are\n"+"roll no is :"+rNo+"\n"+"Name is :"+ name+"\n" +"Grade is :"+grade();
}
}
/**
 * Student
 */
public class Student {
    public static void main(String[] args) {
         InnerStudent s= new InnerStudent();
            s.rNo=53137;
            s.course="Software Engineering";
            s.m1=90;
            s.m2=80;
            s.m3=90;
            s.name="Ahmad Younas";
            String x =String.format("%.2f",s.average());
            System.out.println("Average is :" + x);
            System.out.println("Grade is :" + s.grade());
            System.out.println("Total is :" + s.total());
            System.out.println(s.toString());

        
    }
   

    
}