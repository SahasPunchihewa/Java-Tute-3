import java.util.Scanner;

public class Q2
{
    public static  void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Term : ");
        int no=sc.nextInt(),i=0,no1=0,no2=1,tmp;
        System.out.print(1+",");
        while(i<no)
        {
            System.out.print(no1+no2);
            tmp=no1;
            no1=no2;
            no2=tmp+no2;
            i++;
            if(i<no)
            {
                System.out.print(",");
            }
        }
    }
}
