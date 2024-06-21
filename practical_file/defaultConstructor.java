class Student
{
    int rollNo;
    float height, weight;
    String name, gender;

    Student()
    {
        rollNo = 1;
        name = "Aryan";
        gender = "Male";
        height = 6.0f;
        weight = 55;
    }

    void display()
    {
        System.out.println("Roll No. : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
    }
}


public class defaultConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
