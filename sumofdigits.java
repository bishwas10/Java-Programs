import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class sumofdigits {
    public static void main (String args[])
    {
        int n, sum = 0,r;
        System.out.println("Enter the number");
        Scanner sc= new Scanner (System.in);
        n= sc.nextInt();
        while (n >0)
        {
            r = n%10;
            sum = sum+r;
            n = n/10;
        }

    
 System.out.printf("The sum of number is %d ",sum);
    }
 
    
}
