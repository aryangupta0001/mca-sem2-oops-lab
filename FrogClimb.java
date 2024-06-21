public class FrogClimb {

    public static void main(String[] args) {
        int height = 30, frgHght = 0, hour = 0; 

        // float totalHour = height / heightPerHour;

        while(frgHght < height){
            frgHght = frgHght + 3 - 2;
            hour++;
        }
        System.out.println("Hours taken : " + hour);
    }
}