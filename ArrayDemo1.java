
package Ravi_JSE;

public class ArrayDemo1 {
    public double [] Calculate(int [] brr)
{
double [] result = new double[2];
int s=0;
for(int x:brr)
{
s=s+x;
}
result [0] =s;
result [1]=(double)s/brr.length;
return result;
}    
}
