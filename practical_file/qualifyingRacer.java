import java.util.Scanner;

public class qualifyingRacer {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int[] biker = new int[5];

        int sum = 0, avg;

        System.out.println("Enter the speed of bikers -->\n");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the speed of Biker " + (i + 1) + " : ");
            biker[i] = Sc.nextInt();
            sum += biker[i];
        }

        Sc.close();

        avg = sum / 5;

        System.out.println("Speed Of Qualifying Racers --> ");
        for (int i = 0; i < 5; i++) {
            if (biker[i] > avg)
                System.out.println(biker[i]);

        }
    }
}
