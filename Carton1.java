
package Ravi_JSE;

public class Carton1 {
    private int l,b,h;
public Carton1()
{
l=0;
b=0;
h=0;
}
public Carton1(int s)
{
l=s;
b=s;
h=s;
}
public Carton1(int x,int y,int z)
{
l=x;
b=y;
h=z;
}
public void show()
{
System.out.println(l+","+b+","+h);
}
}
