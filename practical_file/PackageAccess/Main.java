package PackageAccess;

public class Main {
    public int publicField;

    protected int protectedField;;

    int defaultField;

    private int privateField;

    protected void setPrivateField(int privateField) {
        this.privateField = privateField;
    }

    protected int getPrivateField()
    {
        return privateField;
    }
}
