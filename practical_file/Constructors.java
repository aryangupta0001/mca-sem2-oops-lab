class Animal
{   String Name;
    String Color;
    
    Animal()
    {
        System.out.println("This is an Animal\n");
    }

    Animal(String name, String color)
    {
        this.Name = name;
        this.Color = color;

        display();
    }

    Animal(Animal obj)
    {
        this.Name = obj.Name;
        this.Color = obj.Color;

        display();
    }

    void display()
    {
        System.out.println("Name of animal : " + Name + "\nColor of Animal : " + Color + "\n");
    }
}

public class Constructors {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat1  = new Animal("Cat", "Grey");
        Animal cat2 = new Animal(cat1);
    }
}
