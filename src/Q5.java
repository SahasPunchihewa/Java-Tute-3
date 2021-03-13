import java.util.*;
public class Q5
{
    public static void main(String[] args) {
        int number, count, factorial=1;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        number = input.nextInt();
        count = 0;
        while (number > 0 )
        {
            //number = count;
            factorial = factorial * number;
            number--;
        }
        System.out.println("the factorial is " + factorial);
    }
}
