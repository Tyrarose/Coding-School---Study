import java.util.Scanner;

public class FourOperations
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
        
        
        Sagottt=numero1 + numero2;
        System.out.println (+numero1+ " + " +numero2+" = " +Sagottt);
        Sagottt=numero1 - numero2;
        System.out.println (+numero1+ " - " +numero2+" = " +Sagottt);
        Sagottt=numero1 * numero2;
        System.out.println (+numero1+ " * " +numero2+" = " +Sagottt);
        Sagottt=numero1 / numero2;
        System.out.println (+numero1+ " / " +numero2+" = " +Sagottt);
        
    }
}