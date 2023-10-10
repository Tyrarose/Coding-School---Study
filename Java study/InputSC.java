import java.util.Scanner;

class InputSC {
    public static void main(String args[]) {
        /* Scanner is a class of java.utilpackage */
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number  = ");
        /* next() is a method of scanner classwhich takes input from keyboard */
        int x = input.nextInt();

        System.out.println("x = " + x);
        
        String y = input.next();

        System.out.println(y);
    }
}