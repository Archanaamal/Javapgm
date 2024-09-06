package accessmodifier1;

public class Acessmodi2 {

	public static void main(String[] args) {
		Accessmod1 am1=new Accessmod1();
		// System.out.println(am1.);  // a=2 is not accessible with in package
		System.out.println(am1.b);   // defaule am is accessible with in package
	}

}
