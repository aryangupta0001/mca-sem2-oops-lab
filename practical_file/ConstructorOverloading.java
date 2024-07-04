class Shape
{   int a, b;
    float r;

    Shape()
    {
        System.out.println("No shape  defined");
    }

    Shape(int a)
    {   this.a = a;
        System.out.println("This is a suare with side : " + a);
    }

    Shape(int a, int b)
    {   this.a = a;
        this.b = b;
        System.out.println("TThis is a rectangle with length : " + a + " and breadth : " + b);
    }

    Shape(float r)
    {   this.r = r;
        System.out.println("This is a circle : " + r);
    }
}


public class ConstructorOverloading {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape(10);
        Shape s3 = new Shape(10, 3);
        Shape s4 = new Shape(2.3f);

    }
}
