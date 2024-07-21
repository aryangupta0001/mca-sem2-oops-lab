package PublicPackage;

public class PublicAccess {
    public static void main(String[] args) {
        Public obj = new Public();

        obj.value = 10;
        System.out.println(obj.value);
    }
}
