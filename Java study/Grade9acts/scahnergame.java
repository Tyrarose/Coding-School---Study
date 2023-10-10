import java.util.Scanner;
public class scahnergame
{
    public static void main(String[] args)
    {
        String pangalann;
        int huhulaan = 5;
        
        Scanner kunin = new Scanner(System.in);
        System.out.print("\f");  
        System.out.print("Anong pangalan mo?");
        pangalann = kunin.nextLine();
        System.out.print("Humula ka "+pangalann+ " ng numero mula 1 hanggang 10:");
        int hula = kunin.nextInt();
            
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
         }
    }