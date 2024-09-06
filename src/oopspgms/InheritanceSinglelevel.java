package oopspgms;

class Vehicle
{
	public void road()
	{
		System.out.println("Going through road");
	}
	public void fuel()
	{
		System.out.println("Petrol");
	}
}
class Car extends Vehicle
{
	public void model()
	{
		System.out.println("Model:I20");
	}
}

public class InheritanceSinglelevel {

	public static void main(String[] args) {

		Car c=new Car();
		c.road();
		c.fuel();
		c.model();
		

	}

}
