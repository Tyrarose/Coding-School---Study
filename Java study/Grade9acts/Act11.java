import java.util.*;
public class Act11
{
    public static void main(String[] args)
    {
        String pangalann;
        int huhulaan = 5;
        int hula;
        int loop=1;
        char reply;
        System.out.print("\f");
        System.out.print("Anong pangalan mo?");
        Scanner kunin = new Scanner(System.in);
        pangalann = kunin.nextLine();
          do{
            System.out.println("Loop #"+loop);
            System.out.print("Humula ka "+pangalann+ " ng numero mula 1 hanggang 10: ");
            try 
            {
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
            }catch (Exception e)
                {
                    System.out.print("Numbers ang ibigay mo.");
                }
            System.out.print(" Huhula ka pa ba? (y/n)"); 
            loop++; reply=kunin.nextLine(). charAt(0);
         } while ( reply == 'y' || reply == 'Y' );
        System.out.print("Salamat!");
        System.exit(0);
    }
}