import java.io.*;
import java.util.*;

class Solution {
  public static void main(String[] args) {
  
  String s1 = "racearcar";
  System.out.println(palindrome(s1));

}

public static boolean palindrome(String s1)
{
  int begin=0;
  int end = s1.length()-1;
  while(begin<end)
  {
  if(s1.charAt(begin)!=s1.charAt(end))
  {
    return false;
  }
  begin++;
    end--;
  }
  return true;
   
}




}




