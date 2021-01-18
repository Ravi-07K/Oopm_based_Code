
package Ravi_JSE;

import java.util.Scanner;

public class UseStudent2 {
    public static void main(String [] args)
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter Your Roll Name Roll Per");
int r=kb.nextInt();
String n=kb.next();
double p=kb.nextDouble();
Student2 s = new Student2();
s.get(r,n,p);
s.show();
}   
}
