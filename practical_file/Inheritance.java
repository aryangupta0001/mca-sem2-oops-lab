class Quadrilateral
{   void perimeter(int a)
    {
        System.out.println("Perimeter : " + (4*a));
    }

    void perimeter(int l, int b)
    {
        System.out.println("Perimeter : " + (2*(l+b)));
    }
}

class Square extends Quadrilateral
{   Square()
    {
        System.out.println("Square Created");
    }
}

class Rectangle extends Quadrilateral
{
    Rectangle()
    {
        System.out.println("Rectangle Created");
    }
}


class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}






public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Single Inheritance : \n");
        Square S1 = new Square();
        S1.perimeter(10);
        
        System.out.println("\n\nMultilevel Inheritance : \n");
        Puppy P = new Puppy();
        P.eat();
        P.bark();
        P.weep();


        System.out.println("\n\nHierarchical Inheritance\n");
        Square S = new Square();
        Rectangle R = new Rectangle();

        S.perimeter(2);
        R.perimeter(2, 5);

    }
}