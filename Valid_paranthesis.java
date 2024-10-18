/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	
	String s1 = "{([])}";
	System.out.println(validparanthesis(s1));
	
	}
	
	  public static boolean validparanthesis(String s1)
	  {
	      Stack<Character> stack = new Stack<Character>();
	     // char[] c = s1.toCharArray();
	      
	      for(char c: s1.toCharArray())
	      {
	      if(c == '(')
	      {
	          stack.push(')');
	      }
	    else if(c == '{')
	      {
	          stack.push('}');
	      }
	     else if(c == '[')
	      {
	          stack.push(']');
	      }
	      
	      else if(stack.isEmpty() || stack.pop() != c )
	      {
	          return false;
	      }
	      
	      }
	      return stack.isEmpty();
	      
	      
	      
	  }
}
