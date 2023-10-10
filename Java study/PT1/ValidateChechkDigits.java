import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
import java.io.*;
import java.io.IOException;

public class ValidateChechkDigits {

    public static void main(String[] args) {
        Path accListPath = Paths.get("E:\\CP12A files\\Account number list.txt");
        Path validListPath = Paths.get("E:\\CP12A files\\Valid account numbers.txt");
        
        String[] accList = new String[10];
        String nums = " ";
        int i =1;
        int accNum,sum, quo;
                
        try {
            InputStream input = new BufferedInputStream(Files.newInputStream(accListPath));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(validListPath, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            
            //System.out.println();
            writer.write("Valid account numbers:");
            writer.newLine();
            
            nums = reader.readLine();
                            
            while(nums != null)
            {
                
                 writer.write("#"+i+"\t");
                String digits = nums.toString();
                
                
                char last =  digits.charAt(5);
                int a = Integer.parseInt(String.valueOf(last));
                 
                char first =  digits.charAt(0);
                int b = Integer.parseInt(String.valueOf(first));
                
                char second =  digits.charAt(1);
                int c = Integer.parseInt(String.valueOf(second));
                 
                char third =  digits.charAt(2);
                int d = Integer.parseInt(String.valueOf(third));
                
                char fourth =  digits.charAt(3);
                int e = Integer.parseInt(String.valueOf(fourth));
                 
                char fifth =  digits.charAt(4);
                int f = Integer.parseInt(String.valueOf(fifth));
                
                sum = b+c+d+e+f;
                System.out.println(sum);
                quo = sum%10;
                
                if(quo == a)
                {
                    writer.write(nums);
                    writer.newLine();
                    System.out.println();
                }
                else
                {
                    writer.write("Invalid");
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