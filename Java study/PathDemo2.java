import java.util.*;
import java.nio.file.*;
public class PathDemo2 {

    public static void main(String[] args) {
        String name;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a file name: ");
        name = keyboard.nextLine();
        
//          original       
//        Path inputPath = Paths.get(name);
//        Path fullPath = inputPath.toAbsolutePath();

            Path fullPath = Paths.get(name).toAbsolutePath();
        
        System.out.println("Full path is "+fullPath.toString());
        
    }
}