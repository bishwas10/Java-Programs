import java.util.Scanner;
public class areaoftriangle {
    public static void main (String arg[])
    {
        float b,h,area;
        System.out.println ("Enter the base of the triangle ");
        Scanner a = new Scanner (System.in);
        b=a.nextFloat();
        System.out.println ("Enter the height of the triangle ");
        h = a.nextFloat();
        area = (1*b*h/2);
        System.out.println ("Area of Triangle is :"+ area);

       
    }
}
