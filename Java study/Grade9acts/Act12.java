import java.util.*;
public class Act12
{
    public static void main(String[] args) throws Exception
    {
        int t=0, y=0, r=0, a=0; char reply;
        System.out.print("\f");
        Scanner kunin =  new Scanner(System.in);
        do{
            
        try{
            System.out.println("Kindly enter two numbers. (Ex: 4 5)");
            t = kunin.nextInt(); y = kunin.nextInt();
            System.out.println("You've entered "+t+" & "+y);
            r = t/y; a = t%y;
            System.out.println("The quotient is:"+r+" and the remainder is:"+a);
        }catch (InputMismatchException e)
        {
            System.out.println("An integer is required.");
        }catch (ArithmeticException e)
        {
            System.out.println("Cannot divide a number by 0 (ZERO).");
        }
        System.out.println("Do you want more? (Y/N) ");
        reply = kunin.next().charAt(0);
    }while ( reply == 'y' || reply == 'Y' );
   }
}