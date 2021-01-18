
package Ravi_JSE;

import java.util.Scanner;

public class UseCircle1 {
    public static void main(String [] args)
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter radius");
int r=kb.nextInt();
Circle1 obj=new Circle1();
obj.setRadius(r);
obj.calculateArea();
obj.calculateCircumference();
}    
}
