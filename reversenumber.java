import java.util.Scanner;
public class reversenumber {
    public static void main (String args[])
    {
        int n, rev = 0, i, r;
        System.out.println("Enter the three digits number");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        while ( n>0)
        {
             r = n %10;
             rev = rev *10+r;
             n = n/10;

        }
        System.out.printf("The reverse number is %d", rev);
    }
    
}
