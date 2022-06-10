import java.util.Scanner;
public class sum {
    public static void main (String args [])
    {
        int num1, num2, sum;
        System.out.println ("Enter the First number");
        Scanner r= new Scanner (System.in);
        num1 = r.nextInt();
        System.out.println ("Enter the Second  number");
        num2 = r.nextInt();
        sum = num1+num2;
        System.out.println ("The sum of Two number is "+ sum);

        
    }
    
}
