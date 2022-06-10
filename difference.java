import java.util.Scanner;
public class difference {
    public static void main (String ars[])
    {
        int num1, num2, diff;
        System.out.println ("Enter the First number");
        Scanner r = new Scanner (System.in);
        num1 = r.nextInt();
        System.out.println ("Enter the Second number");
        num2 = r.nextInt();
        diff = num1-num2;
        System.out.println ("The Difference of Two number is "+ diff);
    }
    
}
