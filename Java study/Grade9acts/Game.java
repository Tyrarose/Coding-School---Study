import java.util.Scanner;
public class Game
{
    public static void main(String[]args)
    {
        String pangalann;
                      
        Scanner kunin = new Scanner(System.in);
        
        System.out.print("Lagay mo pangalan mo ayok ngagv ");
        pangalann = kunin.nextLine();
        System.out.println("Nasa madilim ka na kwarto "+pangalann+ " sa isang liblib na kastilyo.");
        System.out.println("Enter 1 para tumuloy at 2 para hindi.");
        char choice=kunin.next(). charAt(0);
        if (choice =='1')
            {
            System.out.print("Magaling! tayo na't tumuloy");
            }else if (choice == '2')
            {
            System.out.print("Aking ikinalulungkot ang iyong pagtanggi.");
            }
        
    }
        
         
}