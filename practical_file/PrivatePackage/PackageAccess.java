package PrivatePackage;

public class PackageAccess {
    public static void main(String[] args) {
        Private obj = new Private();

        obj.setValue(10);

        System.out.println("Value : " + obj.getValue());
    }
}
