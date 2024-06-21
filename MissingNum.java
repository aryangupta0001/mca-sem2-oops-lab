import java.util.Scanner;
public class MissingNum {
    public static void main(String[] args) {
        int[] num = new int[100];
        int missingNo = 99+100;

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the array elements : ");

        for (int i = 0; i < 99; i++) {
            num[i] = Sc.nextInt();
        }

        for (int i = 0; i < 99; i++) {
            missingNo = missingNo + i - num[i];
        }

        System.out.println("Missing No. : " + missingNo);

        Sc.close();

    }
}