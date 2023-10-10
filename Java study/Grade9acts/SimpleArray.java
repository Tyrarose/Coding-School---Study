import java.util.*;
public class SimpleArray
{
    public static void main(String[] args)
    {
        int [] nums = {1,3,5,7,9,11,13,15,19};
        System.out.println("\f");
        System.out.print("Array in proper order:");
        for(int A=0;A<=nums.length;A++)
        {
        System.out.print(" "+nums[A]);
        }
        System.out.print("Array in reverse order:");
        for (int B=nums.length-1;B>=0;B--)
        {
            System.out.println(" "+nums[B]);
        }
    }
}