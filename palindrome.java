import java.util.Scanner;
public class palindrome {
    public static void main (String args[])
    {
        int n , rev = 0, r,m;
        System.out.println("Enter the number");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        m = n;
        while ( n>0)
        {
            r = n %10;
            rev = rev*10+r;
            n = n/10;
        }
        if ( rev==m)
        {
            System.out.println("It is a Plaindrome number");
        }    
        else
        {
            System.out.println("It is not a Palindrome number");
        }
        
    }
    
}
