import java.util.*;

class Stacks {

    static Scanner sc = new Scanner(System.in);
    static int[] array = new int[10];
    static int pointer;

    public static void main(String args[]) {
        //Clemente, Tyra 
        //CITCS 1B
        System.out.println("Welcome to the Java stack!");
        boolean flag = true;

        while(flag) {
            System.out.print("\nChoices: [1]Push [2]Pop [3]Exit \n");
            String ans = sc.nextLine(); int an = Integer.parseInt(ans);

            switch(an) {
                case 1:
                    flag = true;
                    if (array[array.length-1] == 0)
                    {
                        pushElement();
                    } else {
                        System.out.print("Maximum number of elements are in the stack.");
                    }
                    break;
                case 2:
                    flag = true;
                    if(array[0] == 0){
                        System.out.print("There are no elements inside of the stack. Please enter a value first.");
                    } else {
                        popElement();
                    }
                    break;
                case 3:
                    flag = false;
                    System.out.println("Thank you for your time. Exiting program...");
                    break;
                default:
                    flag = true;
                    System.out.print("Try again.");
            }
        } 
    }

    public static void pushElement(){
        boolean flag = true;
        while(flag) {
            System.out.print("Enter a number from 1 to 10: ");
            String ans = sc.nextLine(); /*tyra*/ int an = Integer.parseInt(ans);

            if (an > 0 && an < 11){
                flag = false;
                array[pointer] = an;  
                pointer++;

                System.out.print("Here is your current stack: ");
                for (int i=0; i<array.length;i++){
                    System.out.print(array[i]+" ");
                }
            } else {
                flag = true;
                System.out.println("Number is invalid. Please try again.");
            }
        }
    } 

    public static void popElement(){
        for (int i = array.length-1; i>=0; i--) {
            if (array[i] != 0) {
                System.out.println(array[i] + " has been popped! Here is your current stack: ");
                array[i] = 0;
                break;
            }
        }
            
        System.out.print("Here is your current stack: ");
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}