import java.util.*;
import java.io.*;
public class Q4
{
    public static void main(String[] args)
    {
        int number, power=0, count;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        number = input.nextInt();
        System.out.println("Enter power ");
        power = input.nextInt();
        count = 0;
        while (count < power )
        {
            total = total * number;
            count++;
        }
        System.out.println(" the answer is " + total);
    }
}
