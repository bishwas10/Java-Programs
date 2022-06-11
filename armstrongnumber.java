import java.util.Scanner;
public class armstrongnumber {
    public static void main (String args[])
    {
        int n , sum = 0, r,m;
        System.out.println("Enter the number");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        m = n;
        while ( n>0)
        {
            r = n %10;
            sum = sum+r*r*r;
            n = n/10;
        }
        if ( sum==m)
        {
            System.out.println("It is a Armstrong number");
        }    
        else
        {
            System.out.println("It is not a Armstrong number");
        }
        
    }
    
}
