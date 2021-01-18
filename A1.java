
package Ravi_JSE;

public class A1 {
    public A1(int n)
{
System.out.println("Parameterised Constructor of A1 called..");
}
public A1()
{
System.out.println("Non PArameterised constructor of A1 is called....");
}
}
class B1 extends A1
{
public B1()
{
System.out.println("Constructor of B1 Called...");
}    
}
