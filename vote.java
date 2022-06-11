import java.util.Scanner;
public class vote {
   public static void main (String args[])
   {
      int age;
      System.out.println( "Enter the age of ther person");
      Scanner sc = new Scanner (System.in);
      age = sc.nextInt ();
      if (age >=18)
      {
        System.out.println("The person can Vote");
      } 
      else
      {
        System.out.println("The Person cannot Vote");
      }
   
   
   
    }
    
}
