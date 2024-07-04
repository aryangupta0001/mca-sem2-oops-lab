class Shape
{   void calcArea(int a)
    {   System.out.println("Area of Square : " + a*a);
    }

    void calcArea(int a, int b)
    {   System.out.println("Area of Rectangle : " + a*b);
    }

    void calcArea(float r)
    {   System.out.println("Area of Circle : " + 3.14*r*r);
    }
}


public class MethodOverloading {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape();
        Shape s3 = new Shape();

        s1.calcArea(5);
        s2.calcArea(5, 7);
        s3.calcArea(5.3f);
    }
}
