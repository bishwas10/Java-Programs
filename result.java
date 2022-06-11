import java.util.Scanner;


public class result {
    public static void main (String args[])
{
    int marks1, marks2, marks3, marks4,marks5, total;
    float percentage;
    System.out.println("Enter the marks in Computer");
    Scanner sc = new Scanner (System.in);
    marks1 = sc.nextInt();
    System.out.println("Enter the marks in Science");
    marks2 = sc.nextInt();
    System.out.println("Enter the marks in Maths");
    marks3 = sc.nextInt();
    System.out.println("Enter the marks in Nepali");
    marks4 = sc.nextInt();
    System.out.println("Enter the marks in Social");
    marks5 = sc.nextInt();
    total = marks1+marks2+marks3+marks4+marks5;
    percentage = (float )total/5;
    System.out.println("The total marks is "+total);
    System.out.printf("The percentage is %.2f\n", percentage);
    if (percentage >=80)
    {
        System.out.println("Congrats ! Distinction");

    }
    else if ( percentage >=70 && percentage <80)
    {
        System.out.println("Well Done ! First Division");

    }
    else if (percentage >=50 && percentage <70)
    {
        System.out.println("Good ! Second Division");
    }   
    else 
    {
        System.out.println("Sorry ! You are");
    }




}
    
}
