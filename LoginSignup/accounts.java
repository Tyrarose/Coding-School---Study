import java.io.*;
public class accounts extends signup
{

    static String accoutList;

    public static void accountList ()
    {
        System.out.println("Enter Admin Password");
        String[][] People = {{Username},{Password}};
        for (int i=0; i<20; i++)
        {
            for(int j=0; j<20; j++)
            {
               System.out.println(People[i][j]); 
            }
            System.out.println("\n");
        }
    }
    public static boolean People(String Username, String Password) throws IOException
    {
        
        int k=20;
        String[][] people = new String [k][k];
        //String[][] People = {{Username},{Password}};
        
        //Username
        for(int i=0; i<20;)
        {
            for(int j=0; j<20;)
            {
                //people[i][j] = signup.setUsername();
            }
        }
        
        //Password
        for(int i=0; i<20; i++)
        {
            for(int j=1; j<20;)
            {
                //people[i][j] = signup.setPassword();
            }
        }
        return true;
    }
}
