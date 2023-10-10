import java.util.*;
public class InputArray1
{
    public static void main (String[] args)
    {
        int ty=0, ra=0;
        int[] CollectionOfNumbers = new int[10];
        Scanner kuha= new Scanner(System.in);
        System.out.print("\f");
        System.out.println("Please enter the numbers: ");
        for(ra=0;ra<=9;ra++)
        {
            ty=kuha.nextInt();
            CollectionOfNumbers[ra]=ty;
        }
        System.out.println("Array contains: ");
        for(ra=0;ra<=9;ra++)
        {
            System.out.print(CollectionOfNumbers[ra]+" ");
        }
    }
}