public class Main
{
public static void main(String[] args) {
		//System.out.println("Hello World");
		String s = "forgeeksskeegfor";
    System.out.println(longestpalindrome(s));
	}
	public static String longestpalindrome(String s)
	{
	    	int resultlength=0;
		int resultstart=0;
	    int n = s.length();
	    if(n<=2)
	    {
	        return s;
	    }
	    for(int i=0;i<n;i++)
	    {
	        expand_from_centre(s,i,i);
	        expand_from_centre(s,i,i+1);
	    }

	    return s.substring(resultstart, resultstart - resultlength);
	}
	private static void expand_from_centre(String s,int begin,int end)
	{
	    	int resultlength=0;
		int resultstart=0;
	    while(begin>=0 && end<s.length() && 
	    s.charAt(begin) == s.charAt(end))
	    {
	        begin--;
	        end++;
	    }
	   if(resultlength<end-begin-1)
	   {
	       resultlength = end-begin-1;
	       resultstart = begin + 1;
	   }

	   }
}
