
package Ravi_JSE;

abstract class Conversion {
    private double val1;
private double val2;
public Conversion(double val1)
{
this.val1=val1;
}
abstract public void convert();
public double getVal1()
{
return val1;
}
public void setVal2(double val2)
{
this.val2=val2;
}
public double getVal2()
{
return val2;
}
    
}
