class Animal
{
    void sound()
    {
        System.out.println("animal sound");
    }
}
class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Dog Barks");
    }
}
public class over
{
     public static void main(String[] args)
     {
         Animal a = new Dog();

         a.sound();

    }
}
