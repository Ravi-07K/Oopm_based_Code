
package Ravi_JSE;

public class UseManager {
    public static void main(String [] args)
{
Manager  boss;
boss=new Manager();
boss.setEmploy("Deepak",65746.0);
boss.setBonus(54524.0);
System.out.println("Manager's name:"+boss.getName());
System.out.println("Manager's Sal:"+boss.getSal());
System.out.println("Manager's Income:"+boss.getIncome());
}   
}
