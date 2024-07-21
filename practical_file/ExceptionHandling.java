// 1. try-catch block :-

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int a = 20;

//         try {
//             System.out.println(a / (a-a));
//         }

//         catch (ArithmeticException e) {
//             System.out.println(e);
//         }
//     }
// }

// 2. multiple catch :-

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int[] A = new int[10];
//         int len = args.length;

//         try {
//             A[2] = 2 / len;
//             A[10] = 3;
//         }

//         catch (ArithmeticException e) {
//             System.out.println(e);
//         }

//         catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }

// 3. throw :-

//     public class ExceptionHandling {
//         public static void main(String[] args) {
//             int a = args.length;

//             try {
//                 if (a == 0)
//                     throw new ArithmeticException("Can not Divide by Zero");
//                 else
//                     System.out.println(10 / Integer.parseInt(args[0]));
//             }

//             catch (ArithmeticException e) {
//                 System.out.println(e);
//             }
//         }
// }

// 4. throws :-

// public class ExceptionHandling
// {   void divide(int a) throws ArithmeticException
//     {   if(a == 0)
//             throw new ArithmeticException("Can not divide by Zero");

//         else
//             System.out.println(10/a);
//     }
//     public static void main(String[] args) {
//         ExceptionHandling obj = new ExceptionHandling();

//         try
//         {   obj.divide(args.length);
//         }

//         catch (ArithmeticException e)
//         {   System.out.println(e);
//         }
//     }
// }

// 5. finally :-

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();

        try {
            if (b == 0)
                throw new ArithmeticException("Can not Divide by Zero");
            else
                System.out.println("a/b : " + (a / b));
        }

        catch (ArithmeticException e) {
            System.out.println(e);
        }

        finally {
            Sc.close();
        }
    }
}