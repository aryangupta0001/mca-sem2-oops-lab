public class VarTypes {
    int a = 10;
    static float b = 3.5f;

    public static void main(String[] args) {
        VarTypes obj = new VarTypes();
        char c = 'A';

        System.out.println("Instance Variable --> a : " + obj.a);
        System.out.println("Static Variable --> b : " + VarTypes.b);
        System.out.println("Local Variable --> c : " + c);
    }
}