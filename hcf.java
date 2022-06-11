import java.util.Scanner;
public class hcf {
    public static void main (String args[])
    {
        int m ,n,gcd,x,y, i,lcm;
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner (System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        x = m;
        y = n;
        while (m!=n)
        {
            if ( m >n)
            {
                m = m-n;
            }
            if ( n >m)
            {
                n = n-m;
            }
           
            
        }
        gcd = n;
        lcm = (x*y)/gcd;
        System.out.println("The Hcf of two number is " +gcd);
        System.out.println("The Lcm of two number is "+ lcm);

    
    
    
    
    
    
    
    
    
    }
}
