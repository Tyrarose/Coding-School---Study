import java.util.Scanner;

public class Calculator
{
     public static void main(String[]args){
        Scanner Kukuha = new Scanner(System.in);
        int numero1;
        int numero2;
        double Sagottt;
        System.out.print("\f");        
        System.out.println("Enter the first number:");
        numero1 = Kukuha.nextInt();
        System.out.println("Enter the second number:");
        numero2 = Kukuha.nextInt();
        System.out.println("Kindly enter the following keys for the operation to be used.");
        System.out.println("1 for Addition, 2 for Subraction, ");
        System.out.println("3 for Multiplication and 4 for Division");
        char oppp=Kukuha.next(). charAt(0);
            if (oppp == '1')
            {
            Sagottt=numero1 + numero2;
            System.out.println (+numero1+ " + " +numero2+" = " +Sagottt);
            }
            else if (oppp == '2')
            {
             Sagottt=numero1 - numero2;
            System.out.println (+numero1+ " - " +numero2+ " = " +Sagottt);
            }
            else if (oppp == '3')
            {
             Sagottt=numero1 * numero2;
            System.out.println (+numero1+ " * " +numero2+" = " +Sagottt);
            }
            else if (oppp == '4')
            {
             Sagottt=numero1 / numero2;
            System.out.println (+numero1+ " / " +numero2+" = " +Sagottt);
            }
            
    }
}