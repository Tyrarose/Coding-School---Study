
/*
import java.util.*;

public class Quest13 {

    public static int i, arranged;
    public static int list[] = new int[5];
    public static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {

        try {
            System.out.println("Enter a list of random integers:");
            for (i = 0; i < 5; i++) {
                System.out.print("Enter no." + (i + 1) + " value: ");
                list[i] = input.nextInt();
            }

            for (int i = 0; i < list.length; i++) {
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] > list[j]) {
                        arranged = list[i];
                        list[i] = list[j];
                        list[j] = arranged;
                    }
                }
            }

            System.out.println("Smallest no. to Largest no.");
            for (i = 0; i < 10; i++) {
                System.out.print(list[i] + "\t");
            }

        } catch (Exception e) {
            System.out.println("Please Input an Integer!");
        }

    }
}
*/
import java.util.*;

public class Quest13 {

    public int i;
    public int list[] = new int[10];
    public Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new Quest13();
    }

    //constructor
    public Quest13() {
        method(i);
    }

    public void method(int i) {

        System.out.println("Enter a list of 10 random integers: \n");
        for (i = 0; i < 10; i++) {
            System.out.print("Enter no." + (i + 1) + " value: ");
            list[this.i] = input.nextInt();
        }
        compute(this.i);

        // System.out.println("\nSmallest no. to Largest no.\n");
        // System.out.println("Im here");
        // // System.out.println();
        // for (i = 0; i < 10; i++) {
        // System.out.print(list[i] + "\t");
        // }
    }

    public void compute(int i) {
        System.out.println("\nthis i= " + this.i + " upon entering compute method");
        // for (i = 0; i < 10; i++)
        // {
        // System.out.print("Enter no." + (i + 1) + " value: ");
        // list[i] = input.nextInt();
        // }

        System.out.println("Where are you Jude");
        System.out.println(list[1]);
        // if(this.i==10)
        // {
        // this.i=this.i-1;
        // System.out.println("\nSmallest no. to Largest no.\n");
        // for (i = 0; i < 10; i++) {
        // System.out.print(list[this.i] + "\t");
        // }
        // }

        for (i = 0; i < 10; i++) {
            list[this.i] = list[this.i] + list[i];
            list[i] = list[this.i] - list[i];
            list[this.i] = list[this.i] - list[i];
            // System.out.println("hey Jude 2");
            // i=i+1;
            System.out.println("int i= " + i + " upon exit");
            System.out.println("this i= " + this.i + " upon exit");

            System.out.println("Where are you Dude\n");

        }
        next(this.i);
        // else {System.out.println("Error");}

        if (this.i < 10) {
            System.out.println(this.i);
            System.out.println("\n" + list[this.i]);
            // System.out.println("int i= "+ i + " upon exit compute method");
            // System.out.println("this i= "+ this.i + " upon exit compute method");
            System.out.println("\nSmallest no. to Largest no.\n");
            System.out.println("Im here");
            // System.out.println();
            for (i = 0; i < 10; i++) {
                System.out.print(list[i] + "\t");
            }
        } else {
            System.out.println("this i is equal to or greater than 9");
        }
    }

    public void next(int i) {
        System.out.println("this i= " + this.i + " upon entering method next");
        if (this.i < 9) {
            this.i = this.i + 1;

            System.out.println("this i= " + this.i + " upon exit method next\n");
            compute(i);
        } else {
            System.out.println("this i is gretaer than or equal to 9");
        }

        // System.out.println(i);

        // compute(this.i);

    }

}

/*
 * if (list[1] > list[i]) { list[1] = list[1] + list[i]; list[i] = list[1] -
 * list[i]; list[1] = list[1] - list[i]; } if (list[2] > list[i]) { list[2] =
 * list[2] + list[i]; list[i] = list[2] - list[i]; list[2] = list[2] - list[i];
 * } if (list[3] > list[i]) { list[3] = list[3] + list[i]; list[i] = list[3] -
 * list[i]; list[3] = list[3] - list[i]; } if (list[4] > list[i]) { list[4] =
 * list[4] + list[i]; list[i] = list[4] - list[i]; list[4] = list[4] - list[i];
 * } if (list[5] > list[i]) { list[5] = list[5] + list[i]; list[i] = list[5] -
 * list[i]; list[5] = list[5] - list[i]; } if (list[6] > list[i]) { list[6] =
 * list[6] + list[i]; list[i] = list[6] - list[i]; list[6] = list[6] - list[i];
 * } if (list[7] > list[i]) { list[7] = list[7] + list[i]; list[i] = list[7] -
 * list[i]; list[7] = list[7] - list[i]; } if (list[8] > list[i]) { list[8] =
 * list[8] + list[i]; list[i] = list[8] - list[i]; list[8] = list[8] - list[i];
 * } if (list[9] > list[i]) { list[9] = list[9] + list[i]; list[i] = list[9] -
 * list[i]; list[9] = list[9] - list[i]; }
 */