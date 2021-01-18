
package Ravi_JSE;

public class Employee1 {
    private int empId;
private String empName;
private int empAge;
private static int nextId=1;
public Employee1(String name,int age)
{
empName=name;
empAge=age;
empId=nextId++;
}
public void show()
{
System.out.println("EmpID="+empId+",name="+empName+"Age="+empAge);
}
public void showNextId()
{
System.out.println("The next emp ID will be:"+nextId);
}
protected void finalize()
{
--nextId;
}    
}
