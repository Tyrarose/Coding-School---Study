import java.util.*;

class StacksInJava {

    static Scanner sc = new Scanner(System.in);
    static int[] array = new int[10];
    static int pointer;

    public static void main(String args[]) {
        //Clemente, Tyra 
        //CITCS 1B
        System.out.print("Welcome to the Java stack!");
        boolean flag = true;

        while(flag) {
            System.out.print("\nEnter [1] for pushing an element to a stack, [2] for popping an element from a stack, or [3] to exit >> ");
        
            try {
                int an = Integer.parseInt(sc.nextLine());

                switch(an) {
                    case 1:
                        flag = true;
                        if (array[array.length-1] == 0)
                        {
                            pushElement();
                        } else {
                            System.out.print("Maximum number of elements are in the stack. ");
                            for (int i=0; i<array.length;i++){
                                System.out.print(array[i]+" ");
                            }
                        }
                        break;

                    case 2:
                        flag = true;
                        if(pointer == 0){
                            System.out.print/*tyra*/("There are no elements inside of the stack. Please enter a value first.");
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
                        System.out.print("Integer only. Try again.");
                }

            } catch (Exception e) {
                System.out.println("Error. " + e);
            }
        } 
    }

    public static void pushElement(){
        boolean flag = true;
        while(flag) {
            System.out.print("Enter a number from 1 to 10: ");

            try {
                int an = Integer.parseInt(sc.nextLine());

                if (an > 0 && an < 11){
                    flag=false;
                    array[pointer] = an;  
                    pointer++;

                    System.out.print(an + " has been pushed! Here is your current stack: ");
                    for (int i=0; i<array.length;i++){
                        System.out.print(array[i]+" ");
                    }

                } else {
                    flag=true;
                    System.out.println("Number is invalid. Please try again.");
                }
                
            } catch (Exception e) {
                System.out.println("Try again. " + e);
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