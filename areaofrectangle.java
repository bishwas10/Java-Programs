import java.util.Scanner;
public class areaofrectangle {
    public static void main (String args[])
    {
        int l ,b,area;
        System.out.println ("Enter the length of the rectangle");
        Scanner r= new Scanner (System.in);
         l = r.nextInt();
         System.out.println ("Enter the breadth of the rectangle");
         b = r.nextInt ();
         area = l*b;
         System.out.println ("Area of the rectangle is "+ area);

    }
    
}
