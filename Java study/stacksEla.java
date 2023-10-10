import java.util.Scanner;
/*Array
Create a one-dimensional array that can contain ten (10) integer values.
Initialize all values of the array to 0. Any time an element in the array is equal to 0, that means that the element is empty.
The user must be able to choose whether or not they can insert or delete an element in the array.*/

public class stacksEla {
    static int array[] = new int[10];
    
    public static void main(String[] args ) {
        System.out.println("HALLO! this is JAVA STACK");
        menu1();
    }
    public static void pushElement(){
       //System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\n");
       try{ 
            if (array[array.length-1]==0){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter value 1-10: ");
                int inE = Integer.parseInt(sc.nextLine());
                if (inE>0 && inE<11){
                    for (int i = 0; i < array.length; i++) {
                        if (array[i]==0) {
                            array[i] = inE;
                            System.out.println("Element pushed! ");
                            printArray();
                            menu1();
                            break;
                        }
                    }
                } else {
                    System.out.println("Invalid input ! \n + try 1-10");
                    pushElement();
                }
            } else {
                System.out.println("Array is full! + try popping ");
                menu1();
            }
        } catch(Exception e){
            System.out.println("Invalid Input! Try Again (must be an Interger 1-10)");
            pushElement();
        }
    }
    
    public static void popElement(){
        if (array[0]!=0){
            for (int i = array.length-1; i>=0; i--) {
                if (array[i] != 0) {
                    array[i] = 0;
                    System.out.println("Element popped ~");
                    printArray();
                    menu1();
                    break;
                }
            }
        } else {
            System.out.println("Array is empty ! can't pop anymore\n + try pushing");
            menu1();
        }
    }
    
    public static void printArray(){
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]+", ");}
        System.out.println("\n+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    }
    
    static void menu1(){
        System.out.println("---------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print(" your available actions: \n 1 : push \n 2 : pop \n 3 : exit\n Enter your number of choice: ");
        int q = Integer.parseInt(sc.nextLine());
        System.out.println("---------------------------------------------");

        
        try{ 
           if(q>0 && q<4){
            switch (q) {
                case 1:
                    pushElement();
                    break;
                case 2:
                    popElement();
                    break;
                case 3:
                    System.out.println("Thank you for running.");
                    System.out.println("Enjoy the rest of your day.");
                    break;}
            }else{
               System.out.println("Input out of bound. enter valid input(1-3)");
               menu1();}
        }catch(Exception e){
            System.out.println("Invalid Input! Try Again ");
            menu1();
        }
    }
}