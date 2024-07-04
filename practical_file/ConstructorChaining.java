class Chain
{   Chain()
    {   this("This is Overloaded constructor");
        System.out.println("This is default constructor");
    }

    Chain(String msg)
    {   System.out.println(msg);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Chain obj = new Chain();
    }
}
