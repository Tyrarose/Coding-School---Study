import java.io.*;
import java.util.*;
public class preface 
{
    public static Scanner sc;
    public static void main(String[] args) throws IOException
    {
        sc = new Scanner(System.in);
        System.out.print("Welcome to Tacebook\n"
                + "[1] Log-In\n[2] Sign up\n"
                + "Enter number of choice: ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                login.loginMain();
                break;
            case 2:
                signup.signupMain();
                break;
        }
        
    }
}