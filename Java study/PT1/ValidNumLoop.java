import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
import java.io.*;
import java.io.IOException;

public class ValidNumLoop {

    public static void main(String[] args) {
        Path accListPath = Paths.get("E:\\CP12A files\\Account number list.txt");
        Path validListPath = Paths.get("E:\\CP12A files\\Valid accnum loop.txt");
        
        String[] accList = new String[10];
        String nums = " ";
        int i =1;
        int d=0;
        int b,c,accNum, quo;
                
        try {
            InputStream input = new BufferedInputStream(Files.newInputStream(accListPath));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(validListPath, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            
            writer.write("Account numbers\n\n");
            writer.write("\tValid\t\tInvalid");
            writer.newLine();
           
            nums = reader.readLine();
                            
            while(nums != null)
            {
                 writer.write("#"+i+"\t");
                String digits = nums.toString();
                
                int sum =0;
                for(c=0;c<5;c++)
                {
                     char z = digits.charAt(c);
                     d = Integer.parseInt(String.valueOf(z));
                    sum = sum + d;
                }
                    //System.out.println(sum);
                    
                quo = sum%10;
                
                char last =  digits.charAt(5);
                int a = Integer.parseInt(String.valueOf(last));
                
                if(quo == a)
                {
                    writer.write(nums);
                    writer.newLine();
                    System.out.println();
                }
                else
                {
                    writer.write("\t\t"+nums);
                    writer.newLine();
                    System.out.println();
                }
                nums = reader.readLine();
                i++;
            }
            reader.close();
            writer.close();
            
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
/*
String pp = "";
        try
        {
            byte[] a = new byte[10];
            int count =0;
            int readChars =0;
            boolean empty = true;
            while((readChars = input.read(a)) != -1)
            {
                empty = false;
                for(int i=0;i<readChars;i++){
                    if(a[i] == '\n')
                        count++;
                }
            }
            System.out.println(count);
            /*
            pp = reader.readLine();
            do
            {
                String data = pp;
                
                    writer.newLine();
                    System.out.println();
                pp = reader.readLine();
                i= i+2;
            }while(pp != null);
            System.out.println(i);
            //String[][] array = new String[i][5];
            
            Signup.preface();
            reader.close();
            */