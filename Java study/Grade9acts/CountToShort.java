public class CountToShort
{
    public static void main(String[] args)
    {
        System.out.print("\f");
        for(int ty=1; ty<=10; ty++)
        {
            for(int ra=1; ra<=10; ra++)
            {
                System.out.print(ty*ra+"\t");
            }
            System.out.println();
        }
    }
}