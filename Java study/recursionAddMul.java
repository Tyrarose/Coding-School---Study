public class recursionAddMul {
    public static int returnSum(int arr[], int n) {
    if (n <= 0) {
      //return 1 for multiplication
      return 0;
    } else {
      return returnSum(arr, n - 1) + arr[n - 1];
    }
  }
  
	public static void main(String[] args) {
    int gr[] = {1,2,3,4,5,6,7,8,9,10};
    System.out.println(returnSum(gr,10));
	}
}
