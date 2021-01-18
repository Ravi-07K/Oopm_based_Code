
package Ravi_JSE;

public class FtoC extends Conversion {
    public FtoC(double x)
{
super(x);
}
public void convert()
{
double c;
c=5/9.0*(getVal1()-32);
setVal2(c);
}
}
class LtoG extends Conversion
{
public LtoG(double x)
{
super(x);
}
public void convert()
{
double c;
c=getVal1()/3.78;
setVal2(c);
}    
}
