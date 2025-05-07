
import java.io.*;
import java.util.*;

class Solution {
  public static void main(String[] args) {
   String str = "abchdieab";
   System.out.println(longestnonrepeating(str));

  }

public static  String longestnonrepeating(String str)
{
  int start = 0,end=0;
  int max_length = 0, longest_start=0;
  int n = str.length();
    HashSet<Character> set = new HashSet<>();
    while(end<n){
    if(!set.contains(str.charAt(end)))
    {
        set.add(str.charAt(end));
        end++;
    
    if(set.size()>max_length)
    {
        max_length=set.size();
        longest_start=start;

    }
    }
    else
    {
      set.remove(str.charAt(start));
      start++;
    }
    }
    System.out.println("The length of longest substring is: "+max_length);
    System.out.print("The string is: ");
  return str.substring(longest_start,longest_start+max_length);
}


}


