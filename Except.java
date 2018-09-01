package sri;

public class Except {
	  static void fun()
	{
		try
		{
			int a[]=new int[5];
			a[2]=5;
			System.out.println(+a[2]);
			a[7]=19;
			System.out.println(+a[7]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
	}

	public static void main(String[] args) {
		try
		{
		fun();
	}
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println(i);
		}
		System.out.println("rest of the code:");
		// TODO Auto-generated method stub

	}

}
