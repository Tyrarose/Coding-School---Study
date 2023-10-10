import java.util.*;
public class Act10
{
    public static void main(String[] args)
    {
        System.out.print("\f");
        int number;
        int loop=1;
        Scanner kunin = new Scanner(System.in);
            System.out.print("\f");
            System.out.println("This program will print 'I will not sleep in my algebra class.'");
            System.out.print("Kindly enter the number you want the statement to be displayed:");
            number = kunin.nextInt();
        for (int ty=1;ty<=number;ty++)
        {
            System.out.println("#"+loop+" I will not sleep in my algebra class.");
            loop++;
        }
    }
}