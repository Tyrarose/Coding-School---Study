
package performancetask2;

import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.ArrayList;
public class pt2miks
{
    
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    Path filePath = Paths.get("E:\\CP12A files\\credential.csv");
    String [] array = new String [8];
    ArrayList<String> username = new ArrayList<>();
    ArrayList<String> password = new ArrayList<>();
    String dm = ",";
    String s = "";
      
    String fname = array [0];
    String mname = array [1];
    String lname = array [2];
    String dOB = array [3];
    String eAdd = array [4];
    String uname = array [5];
    String pass = array [6];
    String conPass = array [7];
   
    public static void main(String[] args) throws IOException 
    {
        pt2miks ob = new pt2miks();
        ob.glaze();
    }
    
    public void glaze() throws IOException
    {       
        System.out.print("1. Register\n2. Log-in\nEnter choice: ");
        int what = Integer.parseInt(br.readLine());
        if (what==1)
        {register();}
        else if (what==2)
        {logIn();}        
    }
    
    public void register() throws IOException
    {
        try 
        {
            InputStream input = new BufferedInputStream (Files.newInputStream(filePath));
            BufferedReader reader = new BufferedReader (new InputStreamReader (input));
        
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(filePath, WRITE, APPEND));
            BufferedWriter writer = new BufferedWriter (new OutputStreamWriter(output));
            
            s = reader.readLine();
            
            System.out.println("\n-----REGISTER-----\n");
            System.out.print("1. First name: ");
            fname = br.readLine();
            System.out.print("2. Middle name: ");
            mname = br.readLine();
            System.out.print("3. Last name: ");
            lname = br.readLine();
            System.out.print("4. Date of Birth: ");
            dOB = br.readLine();
            System.out.print("5. Email Address: ");
            eAdd = br.readLine();
            System.out.print("6. Username: ");
            uname = br.readLine();
            System.out.print("7. Password: ");
            pass = br.readLine();
            System.out.print("8. Confirm Password: ");
            conPass = br.readLine();
        
        if (pass.equals(conPass)) 
        { 
            s = fname + lname + dm + dOB + dm + eAdd + dm + uname + dm + pass;
            writer.write(s); 
            writer.newLine();
            writer.close();
            System.out.println("\nRegistered Successfulleyyy!");
            strawberry();            
        }
        else 
        {
        do 
        {   
            System.out.print("Password do not match. Confirm Password: ");
            conPass = br.readLine();
            if (!pass.equals(conPass))
            {}
            else 
            {
              s = fname + lname + dm + dOB + dm + eAdd + dm + uname + dm + pass;
              writer.write(s); 
              writer.newLine();
              writer.close();
              System.out.println("\nRegistered Successfullyyyyy!");
              strawberry();                  
              //break;
            }
        }
        while (true);
        }
        }
        catch (Exception e ) 
        {
            System.out.println("Message: " + e);
        }
    }
    
    public void logIn() throws IOException
    {
        boolean uc = true;
        boolean pc = true;
        int i; int p;
        try 
        {
            
            InputStream input = new BufferedInputStream(Files.newInputStream(filePath,READ));
            BufferedReader reader = new BufferedReader (new InputStreamReader (input));
            s = reader.readLine();
            
            while (s !=null )
            {   
            array = s.split(dm);
            s = reader.readLine();
            username.add(array[3]);
            password.add(array[4]);
            
            }
            while (uc){
            System.out.print("Username : ");
                String user = br.readLine();
                if (username.contains(user)){
                    uc = false; 
                    for (i=0; (i<=username.size() && username.get(i).equals(user));i++){
                        i++;
                    }   
                    while (pc){
                        System.out.print("Password : ");
                        String pass = br.readLine();
                        if(password.contains(pass))
                        {
                            for (p=0; (p<=password.size() && password.get(p).equals(pass));p++)
                            {
                                p++;
                            }
                            if(i==p){
                                pc = false;
                                strawberry();
                                break;
                            }else{
                                System.out.println("~wrong password~");
                                pc=true;
                            }              
                        }else{
                            System.out.println("~wrong password~");
                            pc = true;
                        }
                    }
                    s = reader.readLine();
                }
                else{
                    System.out.println("~username doesn't exist~");
                    uc = true;
                }
            }
            
            reader.close();
        }
            
            catch (Exception e)
        {
            System.out.println("Message: " + e);
        }     
    }
    
    public void strawberry() throws IOException
    {
        System.out.print("\n1. Display Profile\n2. Reset Password\n3. Log-out\nEnter choice: ");
        int what = Integer.parseInt(br.readLine());
        if (what==1)
        { displayProfile();}
        if (what==2)
        {resetPassword();}
        if (what==3)
        {glaze();}
    }
    
    public void logOut()
    {
        System.out.println("Logged out");
    }
    
    public void displayProfile()
    {}
    
    public void resetPassword()
    {}
    
}
