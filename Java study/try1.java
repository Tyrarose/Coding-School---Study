import java.util.Scanner;

public class try1 {

  public static void main(String[] args) {
    int n = 0;
    boolean flag;

    do {
      try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value only  ");
        n = sc.nextInt();
        flag = false;
      } catch (Exception e) {
        // accept integer only.
        System.out.println("Enter only integer value.." + e);
        flag = true;
      }
    } while (flag);

    System.out.println("The Integer Value Entered is " + n);
  }
}
