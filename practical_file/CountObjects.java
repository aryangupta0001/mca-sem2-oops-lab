class Sample
{
    static int count;

    Sample()
    {
        count++;
    }
}

public class CountObjects {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample();
        Sample s3 = new Sample();
        Sample s4 = new Sample();
        Sample s5 = new Sample();
        Sample s6 = new Sample();

        System.out.println("No. of Objects created : " + Sample.count);

        System.out.println("\n\nMultiple Table of object count :");

        for(int i = 1; i<=10; i++)
            System.out.println(Sample.count*i);

    }
}
