
package Ravi_JSE;

public class UseIncrement {
    public static void main(String [] args)
{
int a=10;
int b=20;
System.out.println("Before incrementing a = "+a+" b="+b);
Increment obj = new Increment();
obj.increment(a,b);
System.out.println("After incrementing a = "+a+" b="+b);
}
    
}
