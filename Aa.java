
package Ravi_JSE;

public class Aa {
    public Aa(int n)
{
System.out.println("Parameterised Construcor of Aa is called...");
}
}
class Bb extends Aa
{
public Bb()
{
super(65);
System.out.println("Non Parameterised constructor of Bb called...");
}
public Bb(int x)
{
super(x);
System.out.println("Parameterised constructor of Bb called...");
}   
}
