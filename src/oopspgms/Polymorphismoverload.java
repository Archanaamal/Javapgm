package oopspgms;


public class Polymorphismoverload {
	public void add()
	{
		int a=10;
		int b=20;
		System.out.println("sum="+(a+b));
	}
	public void add(int a, int b, int c)
	{
		System.out.println("sum="+(a+b+c));
	}
	public void add(double a,int b)
	{
		double sum=a+b;
		System.out.println("sum="+sum);
		return;
	}
	public void add(int a,double b)
	{
		System.out.println("sum="+(a+b));
	}
	public static void main(String[] args) {
		Polymorphismoverload poly=new Polymorphismoverload();
		poly.add();
		poly.add(20, 30, 50);
		poly.add(20.5, 10);
		poly.add(30, 20.6);

	}

}
