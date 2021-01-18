
package Ravi_JSE;

public class Vehicle {
    public void startEngine()
{
System.out.println("Engine Started!");
}
}
class FourWheeler extends Vehicle
{
public void accelerate()
{
System.out.println("Four Wheeeler Accelerated");
}
}
class Car extends FourWheeler
{
public void playSong()
{
System.out.println("Car Song is playing");
}    
}
