class Outer {
    Outer() {
        System.out.println("This is outer class");
    }

    class Inner {
        Inner() {
            System.out.println("This is inner class");
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        Outer.Inner obj2 = obj1.new Inner();
    }
}