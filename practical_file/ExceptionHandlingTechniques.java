// 1. try-catch block :-

// public class ExceptionHandlingTechniques {
//     public static void main(String[] args) {
//         int a = 20;
//         int b = 0;

//         try {
//             System.out.println(a / b);
//         }

//         catch (ArithmeticException e) {
//             System.out.println(e);
//         }
//     }
// }

// 2. multiple catch :-

// public class ExceptionHandlingTechniques {
//     public static void main(String[] args) {
//         int[] A = new int[10];

//         try {
//             A[10] = 3;
//             A[2] = 2 / 0;
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

// import java.util.Scanner;

// public class ExceptionHandlingTechniques {
//     public static void main(String[] args) {
//         Scanner Sc = new Scanner(System.in);
//         int a = Sc.nextInt();
//         int b = Sc.nextInt();

//         try {
//             if (b == 0)
//                 throw new ArithmeticException("Can not Divide by Zero");
//             else
//                 System.out.println("a/b : " + (a / b));
//         }

//         catch (ArithmeticException e) {
//             System.out.println(e);
//         }

//         Sc.close();
//     }
// }

// 4. throws :-

// import java.util.Scanner;
// public class ExceptionHandlingTechniques
// {   void divide(int a, int b) throws ArithmeticException
//     {   if(b == 0)
//             throw new ArithmeticException("Can not divide by Zero");

//         else
//             System.out.println(a/b);
//     }
//     public static void main(String[] args) {
//         Scanner Sc = new Scanner(System.in);
//         ExceptionHandlingTechniques obj = new ExceptionHandlingTechniques();

//         int a = Sc.nextInt();
//         int b = Sc.nextInt();

//         try
//         {   obj.divide(a, b);
//         }

//         catch (ArithmeticException e)
//         {   System.out.println(e);
//         }
//     }
// }

// 5. finally :-

import java.util.Scanner;

public class ExceptionHandlingTechniques {
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