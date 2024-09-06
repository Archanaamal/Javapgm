package oopspgms;

class Animal
{
	public void eat()
	{
		System.out.println("All animals eat food");
	}
}
class Herbivorus extends Animal
{
	public void veg()
	{
		System.out.println("Herbivorus eat veg foods");
	}
}
class Omnivorus extends Animal
{
	public void mix()
	{
		System.out.println("Omnivorus eat both veg and non veg food");
	}
}
class Carnivorus extends Animal
{
	public void nonveg()
	{
		System.out.println("Carnivorus animal eat nonveg food");
	}
}

public class Inheritancehierarchial {

	public static void main(String[] args) {
		Carnivorus car=new Carnivorus();
		car.eat();
		car.nonveg();
		Omnivorus omni=new Omnivorus();
		omni.eat();
		omni.mix();
		Herbivorus herbi=new Herbivorus();
		herbi.eat();
		herbi.veg();

	}

}
