public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int[] num = {2,4,6,10,2,9};
		int k = 12;
		System.out.println(shortestwindow(num,k));
		}
		public static int shortestwindow(int[] num, int k)
		{
		    int total = 0;
		    int window = Integer.MAX_VALUE;
		    int start = 0, end =0;
		    for(end =0;end<num.length;end++)
		    {
		        total = total + num[end];
		    while(total>=k)
		    {
		        window = Math.min(window , end-start+1);
		        total = total - num[start];
		        start++;
		   }
		    }
		   return window == Integer.MAX_VALUE ? 0:window;

		}

}
