
package Ravi_JSE;

public class UseEmployee {
    public static void main(String [] args)
{
Employee e=new Employee("Ajay",24);
Employee f=new Employee("Vineet",21);
Employee g=new Employee("Varun",22);
e.show();
f.show();
g.show();
e.showNextId();
f.showNextId();
g.showNextId();
}    
}
