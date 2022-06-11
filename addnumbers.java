import java.util.Scanner;
public class addnumbers
{
    public static void main (String args[])
    { 
        int num1, num2, sum;
        System.out.println("Enter the first number");
        Scanner sc  = new Scanner (System.in);
        num1 = sc.nextInt();
        System.out.println("Enter the second number");
        num2 = sc.nextInt();
        sum = num1+num2;
        System.out.println("The sum of "+ num1 + " and " + num2 + " is " + (num1+num2));
        
    }
}