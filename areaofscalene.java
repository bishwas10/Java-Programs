import java.util.Scanner;
import  java.lang.*;

public class areaofscalene
{
    public static void main (String args[])
    {
        int a ,b,c;
        float s;
        double area;
        System.out.println ("Enter the first side of the triangle ");
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();
        System.out.println("Enter the second side of the triangle" );
        b = sc.nextInt();
        System.out.println ("Enter the Third side of the triangle ");
        c = sc.nextInt();

        s = (float)(a+b+c)/2;
        area =  Math.sqrt( s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the rectangle is "+ area);


    }
}
