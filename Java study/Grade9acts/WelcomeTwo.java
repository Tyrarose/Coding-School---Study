import java.util.Scanner;
public class WelcomeTwo
{
    public static void main(String[] args)
    {
        WelcomeTwo welcome3 = new WelcomeTwo();
        
        System.out.println("\f");
        System.out.print("Enter your name:");
        Scanner kunin = new Scanner(System.in);
        String name = kunin.nextLine();
        
        System.out.print("Enter the first number:");
        int namber1 = kunin.nextInt();
        System.out.print("Enter the second number:");
        int namber2 = kunin.nextInt();
        
        welcome3.printme(name, namber1, namber2);
        System.out.println("What do you like to do?");
        System.out.println("Enter 'a' for Addition, 's' for Subtraction, ");
        System.out.println("'m' for multiplication and 'd' for Division. ");
        char oppp = kunin.next().charAt(0);
        
        switch(oppp)
        {
            case 'a':
                welcome3.add(namber1, namber2);
                break;
            
            case 's':
                welcome3.subtract(namber1, namber2);
                break;
            
            
            case 'm':
                welcome3.add(namber1, namber2);
                break;
            
            case 'd':
                welcome3.add(namber1, namber2);
                break;
                
            default: System.out.print("Sorry, you entered an invalid choice.");
            break;

        }   
    }
    
    
    public void printme(String name, int namber1, int namber2)
    {
        System.out.println("Hello "+name+ " and you entered "+namber1+ " and "+namber2+ "." );
    }
    
    public void add(int namber1, int namber2)
    {
        int answer=namber1+namber2;
        System.out.println("The sum of "+namber1+ " plus "+namber2+ " is "+answer+ ".");
    }
    
    public void  subtract(int namber1, int namber2)
    {
        int answer=namber1-namber2;
        System.out.println("The sum of "+namber1+ " minus "+namber2+ " is "+answer+ ".");
    }
    
    public void multiply(int namber1, int namber2)
    {
        int answer=namber1*namber2;
        System.out.println("The sum of "+namber1+ " multiplied to "+namber2+ " is "+answer+ ".");
    }
    
    public void divide(int namber1, int namber2)
    {
        int answer=namber1+namber2;
        System.out.println("The sum of "+namber1+ " divided by "+namber2+ " is "+answer+ ".");
    }
    
}