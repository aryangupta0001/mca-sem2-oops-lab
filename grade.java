import java.util.Scanner;
public class grade {

    public static void main(String[] args) {
        int marks;
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the marks : ");
        marks = Sc.nextInt();

        if(marks>=75)
            System.out.println("Grade : Excellent");
            
        else if(marks >=50)
            System.out.println("Grade : Good");

        else if(marks >=40)
            System.out.println("Grade : Average");`

        else
            System.out.println("Grade : Poor");
        
        Sc.close();
    }
}
