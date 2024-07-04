class Quadrilateral {
    void perimeter(int a) {
        System.out.println("Perimeter : " + (4 * a));
    }

    void perimeter(int l, int b) {
        System.out.println("Perimeter : " + (2 * (l + b)));
    }

    void perimeter(int a, int b, int c, int d) {
        System.out.println("Perimeter : " + (a + b + c + d));
    }
}

class Rectangle extends Quadrilateral {
    Rectangle() {
        System.out.println("Rectangle Created");
    }
}

class Square extends Rectangle {
    Square() {
        System.out.println("This is a square, square is special type of rectangle");
    }
}

class Trapezium extends Quadrilateral {
    Trapezium() {
        System.out.println("Trapezium Created");
    }
}

interface Vehicle {
    void vehicleType();
}

interface FuelDetails {
    void fuleType();
}

class Car implements Vehicle, FuelDetails {
    Car() {
        System.out.println("Vehicle created");
    }

    public void vehicleType() {
        System.out.println("This is a Car");
    }

    public void fuleType() {
        System.out.println("This car runs on Diesel");
    }
}

public class InheritanceTypes {
    public static void main(String[] args) {
        System.out.println("Single Inheritance : \n");

        Rectangle R1 = new Rectangle();
        R1.perimeter(5, 8);

        System.out.println("\n\nMultilevel Inheritance : \n");

        Square S1 = new Square();
        S1.perimeter(10);

        System.out.println("\n\nHierarchical Inheritance\n");

        Rectangle R = new Rectangle();
        R.perimeter(2, 5);

        Trapezium T = new Trapezium();
        T.perimeter(2, 5, 6, 7);

        System.out.println("\n\nMultiple Inheritance\n");

        Car C = new Car();

        C.vehicleType();
        C.fuleType();
    }
}