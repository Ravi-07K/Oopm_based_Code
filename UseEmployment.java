
package Ravi_JSE;

public class UseEmployment {
   public static void main(String [] args)
{
Employment.showNextId();
Employment e=new Employment("Ajay",24);
Employment f=new Employment("Vineet",21);
Employment g=new Employment("Varun",22);
e.show();
f.show();
g.show();
Employment.showNextId();
{
System.out.println("Internship begain.....");
Employment x=new Employment("Deepak",23);
Employment y=new Employment("Jyoti",21);
x.show();
y.show();
Employment.showNextId();
System.out.println("Internship end...");
x=y=null;
System.gc();
System.runFinalization();
}
Employment.showNextId();
e=f=g=null;
System.gc();
System.runFinalization();
}
}



