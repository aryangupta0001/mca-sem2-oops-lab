// public class try_catch {
//         public static void main(String[] args) {
//                 int a = 2;
//         int b = a / 0;

//         System.out.println(b);
// System.out.println("Division by Zero completed");
//     }
// }




// public class try_catch {

//     public static void main(String[] args) {
//         int a = 0;

//         try{
//             int b = a/0;
//         }

//         catch(ArithmeticException e){
//             System.out.println("Can not divide by Zero");
//         }

//         System.out.println("Division by Zero completed");
//     }
// }




public class try_catch {
    public static void main(String[] args) {
        int invalid = 0, count = 0, n;

        for(int i = 0; i<args.length; i++){
            try {
                n = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                invalid = invalid + 1;
                System.out.println("\nInvalid Number : " + args[i]);
            }

            count = count + 1;

            System.out.println("Valid : " + count);
            System.out.println("Invalid : " + invalid);
        }
    }
    
}