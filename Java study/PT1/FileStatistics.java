import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class FileStatistics
{   
    public static void main(String[] args)
    {
        Path filePath = Paths.get("E:\\CP12A files\\Employee.txt");
          int count = filePath.getNameCount(); 
          
        try{
         BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
    
        System.out.println("File name\t\t:"+filePath.getName(count-1));
        System.out.println("Containing folder\t:"+filePath.getName(count-2));
        System.out.format("File size\t\t:%d bytes\n", attr.size());
        System.out.println("File was last modified\t:" + attr.lastModifiedTime());
        
         }catch(IOException e){
             System.err.println(e);
         }
    }
}