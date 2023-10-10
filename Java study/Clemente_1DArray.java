
/*
Create a java program that will use 3 lists and name is as list1, list2, and list3, having 10 elements each. 
The user should input 10 integer values for list1 and 10 integer values for list2. 
Your program should add the contents of list1 and list2 then store the sum to list3. 
Your program should display horizontally the values of list1, list2, and list3. Use loops.
*/

import java.util.Scanner;

public class Clemente_1DArray {
    public static void main(String args[]) {
        int list1[] = new int[10];
        int list2[] = new int[10];

        Scanner in = new Scanner(System.in);

        System.out.println("First");
        for(int i=0; i<list1.length; i++){
            list1[i] = in.nextInt();
        }

        System.out.println("Second");
        for(int j=0; j<list2.length; j++){
            list2[j] = in.nextInt();
        }

        System.out.println("\nList: ");

        //print list 1
        for(int k=0; k<list2.length; k++){
            System.out.print(list1[k]+"\t");
        }

        System.out.println("");

        //print list 2
        for(int k=0; k<list2.length; k++){
            System.out.print(list2[k]+"\t");
        }

        //list 3
        int list3[] = new int[10];
        System.out.println("Sum:");
        for(int k=0; k<list2.length; k++){
            list3[k] = list1[k]+list2[k];
            System.out.print(list3[k]+",");
        }
    }
}


/*
public class Clemente_1DArray {

  public static void main(String args[]) {
    int row[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int col[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    int ans[] = new int[10];
    for (int k = 0; k < row.length; k++) {
      for (int i = 0; i < col.length; i++) {
          //product
        ans[i] = row[k] * col[i];
        System.out.print(ans[i] + "\t");
      }
      System.out.println();
    }
  }
}

*/