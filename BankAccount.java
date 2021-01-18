
package Ravi_JSE;


public class BankAccount {
    private int accountId;
private String custName;
private double bal;
public BankAccount(int id,String name,double bl)
{
accountId=id;
custName=name;
bal=bl;
}
public void showAccountDetails()
{
System.out.println("AccountId "+accountId+",CustName "+custName+",Balance "+bal);
}
public boolean transferAmount(BankAccount Q,double amt)
{
if(bal<amt)
return false;
else
{
bal = bal-amt;
Q.bal=Q.bal+amt;
return true;
}
}   
}
