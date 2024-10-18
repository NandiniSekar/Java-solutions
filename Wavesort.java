public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
	        wavesort(arr);
	        for(int ans:arr)
	        {
	            System.out.print(ans+" ");
	        }
	}
	public static void wavesort(int[] arr)
	{
	    for(int i=0;i<arr.length-1;i++)
	    {
	        if(i%2==0 && arr[i]<arr[i+1])
	        {
	            swap(arr,i,i+1);
	        }
	        if(i%2!=0 && arr[i]>arr[i+1])
	        {
	            swap(arr,i,i+1);
	        }
	    }
	}
	private static void swap(int[] arr,int i,int j)
	{
	    int temp = arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	}

}
