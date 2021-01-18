
package Ravi_JSE;

import java.util.Scanner;

public class UseTryConversion {
    public static void main(String [] args)
{
Scanner kb=new Scanner(System.in);
double wt,ht;
System.out.println("Enter your weight in kg and height in inches");
wt=kb.nextDouble();
ht=kb.nextDouble();
TryConversions tc=new TryConversions();
System.out.println("Your weight in gram is "+tc.KgToGram(wt));
System.out.println("Your height in inches is"+tc.InchesToMm(ht));
}
    
}
