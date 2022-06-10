import java.util.Scanner;
public class perimeterofrectangle {
    public static void main (String args[])
    {
        int l ,b, perimeter;
        System.out.println ("Enter the length of the rectangle");
        Scanner r = new Scanner (System.in);
        l = r.nextInt();
        System.out.println ("Enter the Breadth of the rectangle");
        b = r.nextInt();
        perimeter = 2*(l+b);
        System.out.println ("The perimter of the rectangle is "+ perimeter);
    }
    
}
