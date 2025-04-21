import java.util.Arrays;
 
public class Lengthoflongestunique {
 
	public static void main(String[] args) {
		
		String s = "aabbbccccdddee";
		System.out.print(Arrays.toString(longestsubstring(s)));
		
	}
	
	public static int[] longestsubstring(String s)
	{
		int n = s.length();
		int currentlength = 1;
		int maxlength = 1;
		int startindex=0;
		int maxindex = 0;
		
		for(int i=1;i<n;i++)
		{
			if(s.charAt(i-1)==s.charAt(i))
			{
				currentlength++;
			}
			else {
				if(currentlength>maxlength) {
					maxlength = currentlength;
					maxindex = startindex;
				}
			
				currentlength = 1;
				startindex = i;
				
			}
		}
				
		return new int[] {maxindex, maxlength};
	}
	
	
}

####################################################################################################################3
	/******************************************************************************
String str = "aabbbccccccdddee"; o/p = 6
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		String str = "aabbbccccccdddee";
		char[] ch = str.toCharArray();
		int count = 1;
		int maxlength = 0;
		
		for(int i=1;i<ch.length;i++)
		{
		    if(ch[i-1] == ch[i])
		    {
		        count++;
		    }
		    else{
		       
		        maxlength = Math.max(count,maxlength);
		         count=1;
		    }
		}
		
		System.out.println(maxlength);
		
	}
}
