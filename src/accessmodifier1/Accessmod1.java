package accessmodifier1;

public class Accessmod1 {
	private int a=2;
	int b=10;

	public static void main(String[] args) {
		
		Accessmod1 am=new Accessmod1();
		System.out.println(am.a);    //private--scope with in class only
		System.out.println(am.b);    //default
	}

}
