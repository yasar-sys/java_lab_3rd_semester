import java.util.Scanner;
public class exception_check
{
    public static void main(String[] args)
    {
        int count = 1;

        do {
            try {
                Scanner input = new Scanner(System.in);


                System.out.println("enter num1: ");
                int num1 = input.nextInt();

                System.out.println("enter num2: ");
                int num2 = input.nextInt();

                int result = num1 / num2;

                System.out.println(result);
            }
            catch(Exception e)
            {
                System.out.println("Exception : " + e);
            }

        } while ( count ==1);

    }
}
