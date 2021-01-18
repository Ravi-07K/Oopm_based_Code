
package Ravi_JSE;

public class Circle1 {
    private int radius;
public void setRadius(int r)
{
radius =r;
}
public void calculateArea()
{
double ar=Math.PI*Math.pow(radius,2);
System.out.println("Area is "+ar);
}
public  void calculateCircumference()
{
double circ=2*Math.PI*radius;
System.out.println("Circum is "+circ);
}    
}
