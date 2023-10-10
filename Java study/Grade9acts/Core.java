public class Core
{
    /*
     * The main method illustration implicit casting from one char to int
     * and explicit casting
     */
    public static void main(String[] argo)
    {
        int x=10, Average=0;
        double Quiz_1=10, Quiz_2=9;
        char c='a';
        
        Average=(int) ((Quiz_1 + Quiz_2)/2); //explicit casting
        
        x=c;    //implicit casting
        
        System.out.println("The ASCII equivalent");
        System.out.println("of the character 'a' is: " +x);
        System.out.println("this is the average of two quizzes: " +Average);
    }
}   