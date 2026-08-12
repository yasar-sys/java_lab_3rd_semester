class calculator
{
    int add (int a,int b)
    {
        return a + b;

    }

    int  add (int a,int b,int c)
    {
        return a + b + c;

    }
}
public class poly
{
    public static void main(String[] args)
    {
        calculator c = new calculator();

        System.out.println(c.add(5,4));
        System.out.println(c.add(4,6,7));

    }
}
