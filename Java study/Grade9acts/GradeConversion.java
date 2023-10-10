import java.util.Scanner;

public class GradeConversion
{
    public static void main(String[] args)
    {
        System.out.print("\f");
        Scanner kunin = new Scanner(System.in);
        System.out.println("This program convert grades into its literal equivalent.");
        System.out.print("Enter a number: ");
        int grade = kunin.nextInt();
        System.out.print("Equivalent grade is: ");
        if (grade>=93.00 & grade<=99.00) 
            {
            System.out.println("A. Excellent/Napakahusay ");
            }
            else if (grade>=83.00 & grade<=92.00) 
            {
            System.out.println("B. Very Good/Mahusay");
            }
            else if (grade>=80.00 & grade <= 82.00) 
            {
            System.out.println("C. Good/Mabuti");
            }
            else if (grade>=75.00 & grade<=79.00) 
            {
            System.out.println("D. Fair/Mainam");
            }
            else if (grade<=74.00) 
            {
            System.out.println("E. Poor/Hindi Mahusay");
            }
         }
        }