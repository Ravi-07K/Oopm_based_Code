
package Ravi_JSE;

import java.util.Scanner;

public class UseConversion {
    public static void main(String [] args)
{
Scanner kb=new Scanner(System.in);
Conversion cn;
double a;
System.out.println("Select an option");
System.out.println("1.FtoC\n2.LtoG");
int choice;
choice=kb.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter Forenhite:");
a=kb.nextDouble();
cn=new FtoC (a);
cn.convert();
System.out.println("Forenhite"+cn.getVal1());
System.out.println("Celcius:"+cn.getVal2());
break;
case 2:
System.out.println("Enter litres");
a=kb.nextDouble();
cn=new LtoG (a);
cn.convert();
System.out.println("Litres:"+cn.getVal1());
System.out.println("Gallon:"+cn.getVal2());
break;
default:
System.out.println("Wrong choice!");
}
}
    
}
