
import java.util.Scanner;
public class quadraticequation {
    public static void main (String args[])
    {
        int a ,b , c;
        double r1, r2;
        System.out.println("Enter the coefficient of x sqaure");
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();
        System.out.println("Enter the coefficient of x ");
        b = sc.nextInt();
        System.out.println("Enter the value of constant ");
        c = sc.nextInt();
        r1 = (-b+ Math.sqrt (b*b-4*a*c))/(2*a);
        r2 = (-b- Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("The root of equation is "+r1+" "+r2);


    }
    
}
