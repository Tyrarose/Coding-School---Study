import java.util.*;
import java.io.*;
public class signup 
{
    public static Scanner sc;
    //public static BufferedReader br;
    public static String Username;
    public static String Password;
    static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    public static void signupMain() throws IOException
    {
        System.out.println("\nSIGN UP\n");
        getUsername();
        getPassword();
    }
    public static String getUsername() throws IOException
    {
        
        System.out.print("Enter Username\n>>\t");
        String inUsername = sc.next();
        inUsername = Username;
        return Username;
    }
    public static String getPassword() throws IOException
    {
        System.out.print("Enter Password\n>>\t");
        String inPassword = sc.next();
        inPassword = Password;
        return Password;
    }
    public static void setUsername(String Username) throws IOException
    {
    }
    public static void setPassword(String Password) throws IOException
    {
    }
}
