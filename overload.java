class Shape{
	void Area(int a)
	{	System.out.println("Area of Square : " + a*a);
	}

	void Area(int l, int b)
	{	System.out.println("Area of Rectangle : " + l*b);
	}

	void Area(float r)
	{	System.out.println("Area of cicrcle : " + 3.14*r*r);
	}
}

public class overload{
	public static void main(String[] args)
	{	Shape a = new Shape();
		a.Area(10);
		a.Area(5, 10);
		a.Area(3.5f);
	}
}