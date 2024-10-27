
import java.io.*;
import java.util.*;

import org.junit.internal.ExactComparisonCriteria;

class Solution {
  public static void main(String[] args) {
 String str = "acfgabashj";
 Result result = longestpalindrome(str);
 System.out.println(result.palindrome+" "+result.length);
}

static class Result
{
  String palindrome;
  int length;

  Result(String palindrome, int length)
  {
    this.palindrome = palindrome;
    this.length = length;
  }
}

public static Result longestpalindrome(String s)
{
  if(s==null || s.length()==0)
  {
    return new Result(" ",0);
  }
  int maxLength = 1;
  int start = 0;
for(int i=0;i<s.length();i++)
{
  int len1 = expand_from_centre(s,i,i);
  int len2 = expand_from_centre(s,i,i+1);
  int len = Math.max(len1,len2);
  if(len>maxLength)
  {
      maxLength = len;
      start = i - (maxLength-1)/2;
  }
}

  return new Result(s.substring(start,start+maxLength),maxLength);
}

  private static int expand_from_centre(String s,int left,int right)
  {
      while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right))
      {
        left--;
        right++;
      }

    return right-left-1;
  }



}




