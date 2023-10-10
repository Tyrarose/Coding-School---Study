import java.io.*;
public class login extends accounts
{   
    //static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    //public static String enter;
    public static void loginMain() throws IOException
    {
        System.out.println("\nLOG-IN\n");
        fillUp();
    }
    public static boolean fillUp() throws IOException 
    {
        System.out.print("Enter Username\n>>\t");
        String inUsername = br.readLine();
        if (inUsername.matches(accounts.accoutList))
        {
            System.out.print("Enter Password\n>>\t");
            String inPassword = br.readLine();
        }
        else{
            System.out.println("\nUsername not found in the library!\n[Hit enter]");
            String enter = br.readLine();
            System.out.println("Would you like to create an account? [Y][N]");
            String enter1 = br.readLine();
            if(enter1.contains("y") || enter1.contains("Y"))
            {
                signup.signupMain();
            } 
            else
            {
                System.out.println("\nOK. Thank you! You may now close the program.\n");
            }
        }
        return true;
    }
}