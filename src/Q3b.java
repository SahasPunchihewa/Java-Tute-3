public class Q3b
{
    public static void main(String[] args)
    {
        int i=0,j,k,l=0;
        while(i<8)
        {
            j=8-i;
            k=8-j;
            l=0;
            while(j>0)
            {
                while(l<k)
                {
                    System.out.print(" ");
                    l++;
                }
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
