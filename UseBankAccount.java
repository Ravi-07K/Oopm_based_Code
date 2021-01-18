
package Ravi_JSE;

import java.util.Scanner;

public class UseBankAccount {
    public static void main(String [] args)
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter details for first Account");
int id=kb.nextInt();
String name=kb.next();
double amt=kb.nextDouble();
BankAccount B1=new BankAccount(id,name,amt);
System.out.println("Enter Details for second Account");
id=kb.nextInt();
name=kb.next();
amt=kb.nextDouble();
BankAccount B2=new BankAccount(id,name,amt);
System.out.println("Before Transfer");
B1.showAccountDetails();
B2.showAccountDetails();
System.out.println("Enter amount to transfer");
amt =kb.nextDouble();
boolean ans;
ans =B1.transferAmount(B2,amt);
if (ans==true)
System.out.println("Transfer done successfully");
else
System.out.println("Insufficient balance");
System.out.println("After transferring");
B1.showAccountDetails();
B2.showAccountDetails();
}    
}
