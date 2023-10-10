import java.util.Scanner;

public class RemainderRun
{
    public static void main (String[] argo)
    {
        Scanner Kukuha = new Scanner(System.in);
        int Ty1;
        int Ty2;
        System.out.print("\f");   
        System.out.println("Remainder Program:");
        System.out.println("Enter the first number:");
        Ty1 = Kukuha.nextInt();
        System.out.println("Enter the second number:");
        Ty2 = Kukuha.nextInt();
        
        int Quotient=(Ty1/Ty2);
        int Remainder=(Ty1-(Ty2*Quotient));
        System.out.println("If you divide the first number by the second number, the quotient is " +Quotient+ ".");
        System.out.println("The remainder is " +Remainder+ ".");
    }
}