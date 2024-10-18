public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	int[] num = {1,2,3,5,6};
    System.out.println(missingnumber(num));
	}
	public static int missingnumber(int[] num)
	{
	    int n = num.length;
	    if(n==0)
	    {
	        return -1;
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(num[i]>0 && num[i]<n && num[i] != num[num[i]-1])
	        {
	            int otherindex = num[i]-1;
	            int x = num[i];
	            num[i] = num[otherindex];
	            num[otherindex] = x;
	        }
	        else{
	           i++; 
	        }
	    }
	    for(int i = 0;i<n;i++)
	    {
	        if(num[i] != i+1)
	        {
	            return i+1;
	        }
	    }
	        return num.length+1;
	    }

}
