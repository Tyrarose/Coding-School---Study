import java.util.Scanner;
public class LoveGame
{
    public static void main(String[]args)
    {
        System.out.print("\f");
        System.out.print("Lagay mo name mooo:");
        Scanner kunin = new Scanner(System.in);
        String neym = kunin.nextLine();
        System.out.println("Aking tutukuyin ang iyong pag-asa "+neym+ " sa buhay pag-ibig.");
        System.out.println("Enter 1 para tumuloy at 2 para hindi : ");
        int choice=kunin.nextInt();
            if (choice =='1')
            {
             System.out.print("Magaling! tayo na't tumuloy");
            }else if (choice == '2')
            {
             System.out.print("Aking ikinalulungkot ang iyong pagtanggi.");
            }
        System.out.print("Ilagay mo " +neym+ "ang pangalan ng iniibig.");
        char ibig = kunin.next(). charAt(0);
            if (neym == 't')
            {
             System.out.print("Ikaw ay may 100% chance!");
            }else if (neym == 'y')
            {
             System.out.print("Ikaw ay may 75% chance!");
            }else if (neym == 'r')
            {
             System.out.print("Ikaw ay may 50% chance!");
            }else if (neym == 'a')
            {
             System.out.print("Ikaw ay may 25% chance!");
            }
    }
        
         
}