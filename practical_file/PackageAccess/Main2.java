package PackageAccess;

public class Main2 {
    public static void main(String[] args) {
        Main1 obj = new Main1();

        obj.publicField = 1;
        obj.protectedField = 2;
        obj.defaultField = 3;
        obj.setPrivateField(4);

        System.out.println(obj.publicField);
        System.out.println(obj.protectedField);
        System.out.println(obj.defaultField);
        System.out.println(obj.getPrivateField());


    }
}
