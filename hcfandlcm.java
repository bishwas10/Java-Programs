import java.util.Scanner;
public class hcfandlcm {
    public static void main (String args[])
    {
        int n1, n2, min, gcd,lcm,i;
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner (System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        gcd = sc.nextInt();
        min = ( n1<n2) ? n1: n2;
        for ( i = 1 ; i <=min; i++)
        {
            if ( n1% i ==0 && n2 % i ==0)
            {
                gcd = i;
            }
        }
        lcm = (n1*n2)/gcd;
        System.out.println("The GCD is "+ gcd);
        System.out.println("The Lcm is "+ lcm);



 
        





    }
    
}
