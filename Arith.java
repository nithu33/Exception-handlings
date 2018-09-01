package nithu;
import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {
		int a[]=new int[5];
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no of elements:\t");
		n= input.nextInt();
		System.out.println("enter the array elements:\t");
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
	
		try
		{
			for(int i =0;i<10;i++)
			{
				System.out.println("the display array is" +a[i]);
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("using multiple catch\t");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("hello it is valid or not\t " +ae);
		}
		finally
		{
			a[4]=56;
			System.out.println("the 4th array elements is:\t" +a[4]);
			System.out.println("finally it is printed\t ");
		}
		
		// TODO Auto-generated method stub

	}

}
