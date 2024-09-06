package oopspgms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgrms {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fi=new FileInputStream("E://book.xlsx");   //throws exception can't get output
		
		try
		{
		int a=10,b=0;
		double c=a/b;
		// System.out.println(c);    Exception - division by 0 is not possible so use try catch
		}
		catch(Exception e)
		{
			System.out.println("Exception");
			System.out.println(e.getMessage());   //exception msg will display
		}
		
		try
		{
			int[] a=new int[3];
			a[0]=10;
			a[1]=22;
			a[3]=30;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());   
		}
		finally   //exception handling keyword
		{
			
		}
	}

}
