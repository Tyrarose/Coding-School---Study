import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FileStatistics2 {

    public static void main(String[] args) {
        Path txtPath = Paths.get("E:\\CP12A files\\quote.txt");
        Path docxPath = Paths.get("E:\\CP12A files\\quote.docx");
        
        try{
         BasicFileAttributes txtAttr = Files.readAttributes(txtPath, BasicFileAttributes.class);
         BasicFileAttributes docxAttr = Files.readAttributes(docxPath, BasicFileAttributes.class);
         
         long txtSize = txtAttr.size();
         long docxSize = docxAttr.size();
         int gcd = 1;
         
         for(int i = 1; i <= txtSize && i <= docxSize; i++)
        {
            if(txtSize%i==0 && docxSize%i==0)
                gcd = i;
        }
         int num1 =((int)txtSize)/gcd;
         int num2 = ((int)docxSize)/gcd;

         System.out.println("Text File size\t\t"+txtSize+" bytes");
         System.out.println("Document File size\t"+docxSize+" bytes");
         System.out.println("File size ratio\t\t"+num1+":"+ num2);
         
        }catch(IOException e){
             System.err.println(e);
         }
        
    }
    
}