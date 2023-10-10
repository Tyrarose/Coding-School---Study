package performancetask2;

import java.util.*;
import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

public class Signup
{
    static String[] array = new String[5];
    private static List<String> username = new ArrayList();
    private static List<String> password = new ArrayList();
    static Path filePath = Paths.get("E:\\CP12A files\\credential.csv");
    public static String pp = "";
    
    public static void preface() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Register\n2. Login\n3. Exit");
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        boolean u = true;
        while (u){ 
            System.out.print("Enter Choice: ");
            String ch1 = br.readLine();
            if (ch1.equals("1")){
                u = false;
                System.out.println();
                register();
            }else if (ch1.equals("2")){
                u = false;
                System.out.println();
                login();
            }else if (ch1.equals("3")){
                u = false;
                System.out.println();
                exit();
            }else{
                System.out.println("Kindly enter a valid choice: ");
                u = true;    
            }
        }
    }
    public static int  accNum() {
        String pp = "";
        
         int accnums = 0;
        try{
        InputStream input = new BufferedInputStream(Files.newInputStream(filePath, READ));
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
          
         String nums = reader.readLine();
         while(nums != null)
         {
             nums = reader.readLine();
             accnums++;
         }
         System.out.printf("There are currently %d accounts in the library\n\n",accnums);
         reader.close();
            
        } catch (IOException e) {
            System.err.println(e);
        }
        
        return accnums;
    }
    
    public static void register () throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("1. First Name : ");
        String fn = br.readLine();
        System.out.print("2. Middle Name : ");
        String mn = br.readLine();
        System.out.print("3. Last Name : ");
        String ln = br.readLine();
        System.out.print("4. Date of Birth : ");
        String db = br.readLine();
        System.out.print("5. Email Address : ");
        String em = br.readLine();
        System.out.print("6. Username : ");
        String un = br.readLine();
        System.out.print("7. Password : ");
        String pw = br.readLine();
        boolean p = true;
        while (p){
            System.out.print("8. Confirm Password : ");
            String cpw = br.readLine();
            if (cpw.equals(pw)){
                p = false;
            }else{
                System.out.println("Please input the same password: ");
                p = true;    
            }
        }
        String fullname = fn+" "+mn+" "+ln;
        String newcre = (fullname+","+db+","+em+","+un+","+pw+"\n");
        byte[] regis = newcre.getBytes();
        OutputStream output = null;
        try {
            System.out.println();
            System.out.println("Successfully Registered! ");
            registered();
            output = new BufferedOutputStream(Files.newOutputStream(filePath, WRITE, APPEND));
            output.write(regis);
            output.flush();
            output.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    }
    public static void registered()throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println();
        System.out.println("1. Display Profile\n2. Reset Password\n3. Log-out");
        boolean l = true;
        while (l){
            System.out.print("Enter Choice: ");
            String ch2 = br.readLine();
            if (ch2.equals("1")){
                l = false;
                System.out.println("Team buhatan still working on it");
            }else if (ch2.equals("2")){
                l = false;
                System.out.println();
                //enter method
            }else if (ch2.equals("3")){
                l = false;
                System.out.println();
                PerformanceTask2.preface();
            }else{
                System.out.println("Kindly enter a valid choice: ");
                l = true;    
            }
        }
    }
    
public static void login()throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        boolean uc = true;
        boolean pc = true;
        
        try{
            InputStream input = new BufferedInputStream(Files.newInputStream(filePath,READ));
            BufferedReader reader = new BufferedReader (new InputStreamReader (input));
            String line = "";
            pp = reader.readLine();
            while(pp!=null){
                array = pp.split(",");
                pp = reader.readLine();
                username.add(array[3]);
                password.add(array[4]);  
            }
            while (uc){
            System.out.print("Username : ");
                String user = br.readLine();
                if (username.contains(user))
                {
                    int index = username.indexOf(user) +1;
                    uc = false; 
                    while (pc)
                    {
                        System.out.print("Password : ");
                        String pass = br.readLine();
                            if(pass.equals(password.get(index-1)))
                            {
                                pc=false;
                                registered();
                                }else{
                                System.out.println("~wrong password~");
                                pc=true;
                                }
                    pp = reader.readLine();
                    }
                }
                else{
                    System.out.println("~username doesn't exist~");
                    uc = true;
                        }
                }
             reader.close();
        }catch (Exception e){
            System.out.println(e);
        } 
}
        public static void exit()
        {
        System.out.println("~~exit~~");
        }
    
}
