
package Ravi_JSE;
public class Account1 {
    private int acctId;
private String custName;
private double bal;
public Account1 (int aid,String name,double bl)
{
acctId=aid;
custName=name;
bal=bl;
}
public void showAccount()
{
System.out.println("AccountId "+acctId);
System.out.println("Cust Name "+custName);
System.out.println("Balance  "+bal);
}
}
