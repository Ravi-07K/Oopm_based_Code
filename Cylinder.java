
package Ravi_JSE;

public class Cylinder extends Circle{
    private int height;
public Cylinder(int radius,int height)
{
this.radius=radius;
this.height=height;
}
public double area()
{
return 2*super.area()+2*Math.PI*getRadius()*height;
}
public double volume()
{
return super.area()*height;
}
    
}
