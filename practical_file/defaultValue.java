// Using Objects :-

public class defaultValue {
    int a;
    float b;
    String c = new String();
    char d;

    public static void main(String[] args) {
        defaultValue obj = new defaultValue();

        System.out.println("a : " + obj.a + "\n");
        System.out.println("b : " + obj.b + "\n");
        System.out.println("c : " + obj.c + "\n");
        System.out.println("d : " + obj.d + "\n");
    }
}



// Without using Objects :-

// public class defaultValue {
//     static int a;
//     static float b;
//     static String c = new String();
//     static char d;

//     public static void main(String[] args) {
//         System.out.println("a : " + a + "\n");
        // System.out.println("b : " + b + "\n");
//         System.out.println("c : " + c + "\n");
//         System.out.println("d : " + d + "\n");
//     }
// }
