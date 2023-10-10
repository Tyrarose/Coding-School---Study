import java.io.Console;

class InputCN {
    public static void main(String args[]) {
        /* Console is a class of java.utilpackage */
        Console input = System.console();

        System.out.println("Enter your name ");
        /* readLine() is a method of Console classwhich takes input from keyboard */
        String name = input.readLine();

        System.out.println("Welcome to UC " + name);
    }
}