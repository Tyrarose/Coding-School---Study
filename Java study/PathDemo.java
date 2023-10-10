import java.nio.file.*;

public class PathDemo 
{
    public static void main(String[] args)
    {
        Path filePath = Paths.get("C:\\Users\\Tyra\\Documents\\Resignation Letter.docx");
        
        int count = filePath.getNameCount();
        
        System.out.printf("Path is "+ filePath.toString()
                + "\nFilename is "+ filePath.getName(count -1)
                + "\nThere are %d elements in the file path\n", count);
        
        for(int x=0;x<count;x++)
        {
            System.out.printf("Element %d is %s", x, filePath.getName(x)
                    + "\n"); 
        }
    }
}