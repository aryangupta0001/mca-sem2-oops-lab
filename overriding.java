class A
{	A()
	{	
		System.out.println("A");
	}
	
	A(int a)
	{	this();
		System.out.println("A : " + a);
	}
}

class B extends A
{	B()
	{	System.out.println("B");
	}

	B(int B)
	{	System.out.println("B : " + B);
	}
}


public class overriding
{	public static void main(String [] args)
	{	A a = new A(2);
	}
}