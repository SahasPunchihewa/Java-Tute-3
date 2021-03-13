import java.util.Scanner;

public class Q7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num=sc.nextInt(),sum=0;
        if(num!=11)
        {
            System.out.println("Happy Number !");
            while (num > 1)
            {
                while (num > 0)
                {
                    sum = sum + (num % 10) * (num % 10);
                    num = num / 10;
                }
                System.out.print(sum);
                if (sum != 1)
                {
                    System.out.print(",");
                }
                num = sum;
                sum = 0;
            }
        }
        else
        {
            System.out.println("Unhappy Number !");
        }
    }
}
