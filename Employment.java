
package Ravi_JSE;

public class Employment {
    private int empId;
private String empName;
private int empAge;
private static int nextId=1;
public Employment(String name,int age)
{
empName=name;
empAge=age;
empId=nextId++;
}
public void show()
{
System.out.println("EmpID="+empId+",Name="+empName+",Age="+empAge);
}
public static void showNextId()
{
System.out.println("The next empid will be "+nextId);
}
protected void finalize()
{
--nextId;
}
    
}
