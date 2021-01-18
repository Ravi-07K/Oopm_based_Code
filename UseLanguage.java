
package Ravi_JSE;

import java.util.Scanner;

public class UseLanguage {
   public static void main(String [] args)
{
Language lg;
Scanner kb=new Scanner(System.in);
String choice;
System.out.println("In which language you want to print");
System.out.println("Options are");
System.out.println("1.Hindi\n2.English\n3.French");
choice = kb.next();
switch(choice)
{
case "H":
lg=new Hindi();
lg.morningGreetings();
break;
case "E":
lg=new English();
lg.morningGreetings();
break;
case "F":
lg=new French();
lg.morningGreetings();
break;
default :
System.out.println("Wrong choice");
}
} 
    
}
