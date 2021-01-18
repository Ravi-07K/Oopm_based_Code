
package Ravi_JSE;

public class UseIncrement1 {
    public static void main(String [] args)
{
Increment1 D =new Increment1();
D.setData(10,20);
System.out.println("Before incrementing ");
D.show();
Increment1 temp = new Increment1();
temp.Increment(D);
System.out.println("After incrementing ");
D.show();
}
    
}
