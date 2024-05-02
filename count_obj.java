class Obj{
    static int count = 0;

    Obj(){
        count++;
    }
}

public class count_obj {
    public static void main(String[] args) {
        Obj Obj1 = new Obj();
        Obj Obj2 = new Obj();
        Obj Obj3 = new Obj();
        Obj Obj4 = new Obj();
        Obj Obj5 = new Obj();

        System.out.println("No. of objects = " + Obj.count);
    }
}
