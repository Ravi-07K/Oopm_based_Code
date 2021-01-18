
package Ravi_JSE;

public class Account {
 private int acctId;
private String custName;
private double bal;
public Account()
{
acctId = 101;
custName="Ravi";
bal=50000.09;
}
public  void showAccount()
{
System.out.println("AccId = "+acctId);

System.out.println("CustName = "+custName);
System.out.println("Balance = "+bal);
}
}
