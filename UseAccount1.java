
package Ravi_JSE;

import java.util.Scanner;

public class UseAccount1 {
    public static void main(String [] args)
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter Account id name Balance");
int id=kb.nextInt();
String name=kb.next();
double bal=kb.nextDouble();
Account1 obj = new Account1(id,name,bal);
obj.showAccount();
}   
}
