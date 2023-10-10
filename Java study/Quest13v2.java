import java.util.*;

public class Quest13v2 {

    public static int i;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 5;
        
        int list[] = new int[5];

        System.out.println("Enter a list of 10 random integers: \n");
        for (i = 0; i < n; i++) {
            System.out.print("Enter no." + (i + 1) + " value: ");
            list[i] = input.nextInt();
        }

        Arrays.sort(list);  

        for (i = 0; i < n; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println(); 

        for (i = 0; i < n; i++) {
            System.out.println(list[i]);

            list[i] = list[i] + list[i];
            System.out.println(list[i] = list[i] + list[i]);

            list[i] = list[i] - list[i];
            System.out.println(list[i] = list[i] - list[i]);

            list[i] = list[i] - list[i];
            System.out.println(list[i] = list[i] - list[i]);
        }

    }
}