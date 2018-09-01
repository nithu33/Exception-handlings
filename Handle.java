package srinithi;

public class Handle {
	static void fun()throws NullPointerException
	{
		System.out.println("not valid:\t ");
		
		
	}
	static void fun1()throws ArithmeticException
	
	{
		System.out.println("hello everyone:\t ");
		
		
	}
	static void fun2()
	{
		try
		{
			throw new NullPointerException("it is a null pointer\t");
		}
		catch(NullPointerException k)
		{
			System.out.println("using null pointer exception:\t");
		}
	}

	public static void main(String[] args) {
		try
		{
			fun();
		}
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println("welcome to java:\t");
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("it is valid:\t");
		}
		System.out.println("hello srinithi");
		try
		{
			fun1();
			fun2();
		}
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println("welcome to java:\t");
		}
		// TODO Auto-generated method stub

	}

}
