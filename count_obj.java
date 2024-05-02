class Obj {
    static int count = 0;

    Obj() {
        count++;
    }
}

public class count_obj {
    static int count = 0;

    count_obj(){
        count++;
    }

    public static void main(String[] args) {
        // To create objects of outer class (Obj)
        Obj Obj1 = new Obj();
        Obj Obj2 = new Obj();
        Obj Obj3 = new Obj();
        Obj Obj4 = new Obj();
        Obj Obj5 = new Obj();
        System.out.println("No. of count_objects = " + Obj.count);

        // To create objects of samme class (count_obj)
        count_obj count_obj1 = new count_obj();
        count_obj count_obj2 = new count_obj();
        count_obj count_obj3 = new count_obj();
        count_obj count_obj4 = new count_obj();
        count_obj count_obj5 = new count_obj();

        System.out.println("No. of count_objects = " + count);
    }
}
