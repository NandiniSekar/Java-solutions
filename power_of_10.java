/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		long num=70;
		System.out.println(powerofTen(num));
		
	}
	
	public static boolean powerofTen(long num) 
	{
	    
	    if(num%10 != 0 || num == 0)
	    {
	        return false;
	    }
	    if(num == 10)
	    {
	        return true;
	    }
	    
	    return powerofTen(num/10);
	    
	}
	
	
}
