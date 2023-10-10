import java.util.Scanner;

public class OdddEven
{
    public static void main(String[] args)
    {
        System.out.print("\f");
        Scanner kunin = new Scanner(System.in);
        System.out.println("This program evaluates a number if it is either Even or Odd");
        System.out.println("Enter a number:");
        int A = kunin.nextInt();
            
        if (A % 2 == 0)
        {
         System.out.println("The number is even.");
        }
        else
        {
         System.out.println("The number is odd.");
        }   
    }
}