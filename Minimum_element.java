public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	int[] arr = {5,6,9,3,4};
System.out.println(mininsorted(arr));
	}
	public static int mininsorted(int[] arr)
  {
    int low = 0;
    int high = arr.length - 1;
    while(low<high)
 
    {
       int mid = low + (high - low)/2;
    if(arr[mid]>arr[high])
    {
      low = mid + 1;
    }
    else
    {
      high = mid;
    }
    }
 
    return arr[high];
  }
 
}
