import java.nio.file.*;

public class SameFolder {
    public static void main(String[] args) {
        Path filePath1 = Paths.get("C:\\Users\\Tyra\\Documents\\Resignation Letter.docx");
        Path filePath2 = Paths.get("C:\\Users\\Tyra\\Documents\\chap 2 3 4.docx");
        
        if(filePath1.equals(filePath2) ||  filePath2.equals(filePath1))
        {
            System.out.println("Two files are located on the same folder");
        } else{
            System.out.println("Two files are NOT located on the same folder");
        }
    }
}