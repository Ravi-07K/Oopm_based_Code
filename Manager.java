
package Ravi_JSE;

public class Manager extends Employ{
    private double bonus;
public void setBonus(double bonus)
{
this.bonus=bonus;
}
public double getIncome()
{
double total;
total=getSal()+bonus;
return total;
}
    
}
