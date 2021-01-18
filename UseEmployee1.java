
package Ravi_JSE;

public class UseEmployee1 {
    public static void main(String [] args)
{
Employee1 e=new Employee1("Ajay",24);
Employee1 f=new Employee1("Vineet",21);
Employee1 g=new Employee1("Varun",22);
e.show();
f.show();
g.show();
e.showNextId();
{
System.out.println("Internship begains....");
Employee1 x = new Employee1("Deepak",23);
Employee1 y = new Employee1("Jyoti",22);
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
