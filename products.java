import java.util.Scanner;
public class products {
    public static void main (String args[])
    {
        int num1 , num2 , product;
        System.out.println("Enter the first number ");
        Scanner sc = new Scanner(System.in);
        num1  = sc.nextInt ();
        System.out.println( "Enter the Second number");
        num2= sc.nextInt();
        product = num1*num2;
        System.out.printf("The sum of %d and %d is %d\n", num1, num2, product);
    }
    
}
