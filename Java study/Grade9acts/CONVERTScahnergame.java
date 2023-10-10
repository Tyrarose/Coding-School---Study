import java.util.*;
public class CONVERTScahnergame
{
    public static void main(String[] args)
    {
        String pangalann;
        char reply;
        int huhulaan = 5;
        int hula;
        int loop=1;
        
        Scanner kunin = new Scanner(System.in);
            System.out.print("\f");
            System.out.print("Anong pangalan mo?");
            pangalann = kunin.nextLine();
          do{
            System.out.println("Loop #"+loop);
            System.out.print("Humula ka "+pangalann+ " ng numero mula 1 hanggang 10: ");
            hula = kunin.nextInt();
                
                if (hula == huhulaan) 
                    {
                    System.out.println("Panalop ka!");
                    }
                    else if (hula < huhulaan) 
                    {
                    System.out.println("Masyadong mababa <");
                    }
                    else if (hula > huhulaan) 
                    {
                    System.out.println("Masyadong mataas >");
                    } 
            loop++;
            System.out.print("Do you want more? (y/n)");  
            reply=kunin.next(). charAt(0);
         } while (reply == 'y' || reply == 'Y' );
         System.out.print("Salamat!");
         System.exit(0);
    }
}