import java.io.*;

public class SimpleFileFolder 
{
    public static void main(String[] args) 
    {
        try{
             System.out.println();
        
        String filePath1 = "C:\\Users\\Tyra\\Documents\\Resignation Letter.docx";
        String filePath2 = "C:\\Users\\Tyra\\Documents\\chap 2 3 4.docx";
        File file1 = new File(filePath1);
        File file2 = new File(filePath2);
        
            System.out.format("%s\n%s\n", filePath1, filePath2);
        
        if(file1.exists()||file2.exists())
        {
            String folder1 = file1.getParent();
            String folder2 = file2.getParent();
            
            if(folder1.equals(folder2) || folder2.equals(folder1))
            {
                System.out.println("The two files are located in the SAME folder");
            }        
            else
            {
                    System.out.println("The two files are NOT located in the SAME folder");
                    }
        }
        else
        {
            System.out.println("\nFile not found");}
         } 
         catch(Exception e)
         {
             System.out.println("Error");
         }
         System.out.println();
    }
}