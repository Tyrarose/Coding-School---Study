public class Remainder
{
    public static void main (String[] argo)
    {
        int Ty1=26, Ty2=5;
        int Quotient=(Ty1/Ty2);
        int Remainder=(Ty1-(Ty2*Quotient));
        System.out.println("The first number is " +Ty1+ ".");
        System.out.println("The second number is " +Ty2+ ".");
        System.out.println("If you divide the first number by the second number, the quotient is " +Quotient+ ".");
        System.out.println("The remainder is " +Remainder+ ".");
    }
}