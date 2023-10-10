import java.io.*;

class InputBR {
    public static void main(String args[]) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);

        System.out.println("Enter your name");
        String name = input.readLine();
        
        System.out.println("Welcome to UC " + name);
    }
}