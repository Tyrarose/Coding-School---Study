//nsa iisang class na
package performancetask2;
import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.image.*;
import java.io.IOException;

public class PerformanceTask2t 
{
     BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    Path filePath = Paths.get("E:\\CP12A files\\credential.csv");
    String[] array = new String[8];
    ArrayList<String> username = new ArrayList<>();
    ArrayList<String> password = new ArrayList<>();
    String pp = "";
    String fn = array [0];
    String mn = array [1];
    String ln = array [2];
    String db = array [3];
    String em = array [4];
    String un = array [5];
    String pw = array [6];
    String cpw = array [7];
    
    public static void main(String[] args) throws IOException
    {
        PerformanceTask2t m = new PerformanceTask2t();
        m.entry();
    }
    
    public void entry() throws IOException
    {
        System.out.println("1. Register\n2. Login\n3. Exit");
        boolean u = true;
        while (u){ 
            System.out.print("Enter Choice: ");
            String ch1 = br.readLine();
            if (ch1.equals("1")){
                u= false;
                register();
            }else if (ch1.equals("2")){
                u=false;
                login();
            }else if (ch1.equals("3")){
                u = true;
                exit();
            }else{
                System.out.println("Kindly enter a valid choice: ");
            }
        }
    }
    
    public void register()throws IOException{
       try {
        InputStream input = new BufferedInputStream (Files.newInputStream(filePath));
            BufferedReader reader = new BufferedReader (new InputStreamReader (input));
        
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(filePath, WRITE, APPEND));
            BufferedWriter writer = new BufferedWriter (new OutputStreamWriter(output));
            
            pp = reader.readLine();
            
        System.out.println("\n-----REGISTER-----\n");
        System.out.print("1. First Name : ");
        fn = br.readLine();
        System.out.print("2. Middle Name : ");
        mn = br.readLine();
        System.out.print("3. Last Name : ");
        ln = br.readLine();
        System.out.print("4. Date of Birth : ");
        db = br.readLine();
        System.out.print("5. Email Address : ");
        em = br.readLine();
        
        //boolean taken = true;
        //while(taken){
            
        System.out.print("6. Username : ");
        un = br.readLine();
            //if (username.contains(un))
            {
                //System.out.println("Username is already taken\nPlease try another one:");
                //taken = false;
            }
        //}
        System.out.print("7. Password : ");
        pw = br.readLine();
            System.out.print("8. Confirm Password : ");
            cpw = br.readLine();
            
             boolean p = true;
             
            
            if (cpw.equals(pw)){
               // p = false;
                //String fullname = fn+" "+mn+" "+ln;
        //pp = (fullname+","+db+","+em+","+un+","+pw+"\n");
       pp = fn+mn+ln+db+em+un+pw;
        //byte[] regis = newcre.getBytes();
        //OutputStream output = null;
        
            
           // output = new BufferedOutputStream(Files.newOutputStream(filePath, WRITE, APPEND)); 
            writer.write(pp);
            writer.newLine();
            //output.flush();
            output.close();
            System.out.println("\nSuccessfully Registered! ");
            registered();
            }else{
                do{
                System.out.println("Please input the same password: ");
                cpw = br.readLine();
                if(!cpw.equals(pw))
                {}
                else
                {
                    pp = fn+mn+ln+db+em+un+pw;
                    writer.write(pp); 
              writer.newLine();
              writer.close();
              System.out.println("\nRegistered Successfullyyyyy!");
              registered(); 
                }
                    
                } while(true);
            }
        
        
        
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    
    public void registered()throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("\n~ WELCOME ~\n"); 
        while (true){
            System.out.println("1. Display Profile\n2. Reset Password\n3. Log-out\nEnter Choice: ");
            String ch2 = br.readLine();
            if (ch2.equals("1"))
            {
                System.out.println();
                unavailable();
                System.out.print(" \t   _For beta users only_\n(\t  press enter to go back)\n");
                String enter = br.readLine();
            }else if (ch2.equals("2")){
                System.out.println();
                unavailable();
                System.out.print(" \t   _For beta users only_\n\t  (press enter to go back)\n");
                String enter = br.readLine();
            }else if (ch2.equals("3")){
                System.out.println();
                entry();
            }else{
                System.out.println("Kindly enter a valid choice: ");
            }
        }
    }
    
    public void exit()
    {
        System.out.println("~~exit~~");
    }
    public void login()throws IOException{
        //BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        boolean uc = true;
        boolean pc = true;
        try{
            InputStream input = new BufferedInputStream(Files.newInputStream(filePath,READ));
            BufferedReader reader = new BufferedReader (new InputStreamReader (input));
            //String line = "";
            pp = reader.readLine();
            while(pp!=null){
                array = pp.split(",");
                pp = reader.readLine();
                username.add(array[3]);
                password.add(array[4]);  
            }
            while (uc){
                System.out.println();
            System.out.print("Username : ");
                String user = br.readLine();
                if (username.contains(user))
                {
                    uc=false;
                    int index = username.indexOf(user) +1;
                    while (pc)
                    {
                        System.out.print("Password : ");
                        String pass = br.readLine();
                            if(pass.equals(password.get(index-1)))
                            {
                                registered();
                                }else{
                                System.out.println("~wrong password~");}
                    
                    }
                    pp = reader.readLine();
                }
                else{
                    System.out.println("~username doesn't exist~");
                    uc= true;
                        }
             reader.close();
                }
        }
            catch (Exception e)
            {
            System.out.println(e);
            } 
}
    
    
    
    
    
    /*
    public void reset() throws IOException {
         BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
          try {
             System.out.print("Enter old password: ");
        String oldPW = br.readLine();
        
        
        System.out.print("Enter new password; ");
        String newPW = br.readLine();
        while (true){
            System.out.print("Confirm New Password : ");
            String newPWcon = br.readLine();
            if (newPWcon.equals(newPW)){
            }else{
                System.out.println("Please input the same password: ");
            }
        }
        
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
        String resetpass = cpw;
        String newcre = (fullname+","+db+","+em+","+un+","+pw+"\n");
        byte[] regis = newcre.getBytes();
        OutputStream output = null;
        try {
            System.out.println("\nSuccessfully Registered! ");
            registered();
            output = new BufferedOutputStream(Files.newOutputStream(filePath, WRITE, APPEND)); 
            output.write(regis);
            output.flush();
            output.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

// Read existing file 
//CSVReader reader = new CSVReader(new FileReader(filePath), ',');
InputStream input = new BufferedInputStream(Files.newInputStream(filePath,READ));
BufferedReader reader = new BufferedReader (new InputStreamReader (input));
String n = reader.readLine();       
//List<String[]> csvBody = reader.readAll();
List<String[]> csvBody = reader.readLine();
// get CSV row column  and replace with by using row and column
csvBody.get(row)[col] = replace;
reader.close();

// Write to CSV file which is open
CSVWriter writer = new CSVWriter(new FileWriter(inputFile), ',');
writer.writeAll(csvBody);
writer.flush();
writer.close();
            output = new BufferedOutputStream(Files.newOutputStream(filePath, WRITE, APPEND)); 
            output.write(regis);
            output.flush();
            output.close();
            System.out.println("Password successfully changed");
        }
        catch (Exception e){
            System.out.println(e);
        }
        
        
        File inputFile = new File(filePath);

        // Read existing file
        CSVReader reader = new CSVReader(new FileReader(inputFile), ',');
        List<String[]> csvBody = reader.readAll();
        // get CSV row column and replace with by using row and column
        for(int i=0; i<csvBody.size(); i++){
            String[] strArray = csvBody.get(i);
            for(int j=0; j<strArray.length; j++){
                if(strArray[j].equalsIgnoreCase("Update_date")){ //String to be replaced
                    csvBody.get(i)[j] = "Updated_date"; //Target replacement
                }
            }
        }
        reader.close();

        // Write to CSV file which is open
        CSVWriter writer = new CSVWriter(new FileWriter(inputFile), ',');
        writer.writeAll(csvBody);
        writer.flush();
        writer.close();
    }
    
    
    */
    
    
    
    
    
    
    
    
    
    
    
    
    public void unavailable() throws IOException{
        int width = 60;
        int height = 30;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.BOLD, 15));
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString("NO", 10, 20);
        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {
                sb.append(image.getRGB(x, y) == -16777216 ? " " : "#");
            }
            if (sb.toString().trim().isEmpty()) {
                continue;
            }
            System.out.println(sb);
        }
} 
}