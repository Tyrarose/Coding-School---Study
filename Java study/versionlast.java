import java.util.Scanner;

class versionlast {

    static Scanner sc = new Scanner(System.in);
    static int n = 10;
    static int pointer;
    static int[] array = new int[n];

    public static void main(String args[]) {
        /*
        Array
        Create a one-dimensional array that can contain ten (10) integer values.
        Initialize all values of the array to 0. Any time an element in the array is equal to 0, that means that the element is empty.
        The user must be able to choose whether or not they can insert or delete an element in the array.
        */

        System.out.println("Welcome to the Java stack!");
        boolean flag = true;

        while(flag) {
            System.out.print("Enter [1] for pushing an element to a stack, [2] for popping an element from a stack, or [3] to exit >> ");
        
            try {
                String ans = sc.nextLine(); int an = Integer.parseInt(ans);
                switch(an) {
                    case 1:
                        flag=true;
                        pushElement();
                    break;
                    case 2:
                        flag=true;
                        popElement();
                    break;
                    case 3:
                        flag=false;
                        System.out.println("Thank you for your time. Exiting program...");
                        break;
                    default:
                        flag=true;
                        System.out.println("Try again.");

                }

            } catch (Exception e) {
                System.out.println("Try again. " + e);
            }
        }
        
    }

    public static void pushElement(){
        boolean flag = true;
        while(flag) {
            System.out.print("Enter a number from 1 to 10: ");

            try {
                String ans = sc.nextLine(); int an = Integer.parseInt(ans);

                if (an > 0 && an < 11){
                    flag=false;

                    array[pointer] = an;  
                    pointer++;
                    System.out.println("pointer: " + pointer);

                    System.out.print(ans + " has been pushed. Here is your current stack: ");
                    for (int i=0; i<array.length;i++){
                        System.out.print(array[i]+" ");
                    }

                } else {
                    flag=true;
                    System.out.println("Number is invalid. Please try again.");
                }

            } catch (Exception e) {
                System.out.println("Integer only. Try again. " + e);
            }
        }
    } 

    public static void popElement(){
        /*
        if (array =  empty){
            System.out.println("There are no elements inside of the stack. Please enter a value first.");
        } else {
            System.out.println("pop");
        }
        */
        System.out.print(" has been popped. Here is your current stack: ");
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}