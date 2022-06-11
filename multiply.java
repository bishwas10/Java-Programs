import java.util.Scanner;
public class multiply {
    public static void main (String args[])
    {
        
        int num,i;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt ();
       for (i = 1; i <=10; i++)
       {
        System.out.printf("%d * %d = %d\n",num,i,num*i);
       }

    }
    
}
