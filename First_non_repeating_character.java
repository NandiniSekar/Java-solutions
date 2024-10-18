/******************************************************************************
First non repeating character
 
*******************************************************************************/

import java.util.*;

public class Main

{

	public static void main(String[] args) {

	//	System.out.println("Hello World");

  //  System.out.println("Hello World");

  String s1 = "aabbbcded";

  char[] ch = s1.toCharArray();

  int n = ch.length;

   int[] count = new int[256];

   for(int i =0;i<n;i++)

   {

   count[i]=1;

    for(int j=i+1;j<n;j++)

    {

        if(ch[i]==ch[j])

        {

          count[i] = count[i]+1;

          ch[j]='0';

        }

    }

   }
 
  for(int k = 0;k<n;k++)

  {

    if(count[k]==1 && ch[k]!= '0')

    {

        System.out.println("The character which is non repeated is: ");

      System.out.println(ch[k]);

      break;

    }

  }
 
 
}
 
}
 
 
 
