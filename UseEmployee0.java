
package Ravi_JSE;

public class UseEmployee0 {
    public static void main(String [] args)
{
Employee0 e=new Employee0("Ajay",24);
Employee0 f=new Employee0("Vineet",21);
Employee0 g=new Employee0("Varun",22);
e.show();
f.show();
g.show();
e.showNextId();
{
System.out.println("Internship begains....");
Employee0 x = new Employee0("Deepak",23);
Employee0 y = new Employee0("Jyoti",22);
x.show();
y.show();
x.showNextId();
System.out.println("Internship Ends....");
x=y=null;
System.gc();
System.runFinalization();
}
e.showNextId();
}
}
