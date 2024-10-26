import java.io.*;
import java.util.*;

class Solution {
  public static void main(String[] args) {
  String s1 = "cat";
  String s2 = "ace";
  System.out.print(anagram(s1,s2));
}

public static boolean anagram(String s1,String s2)
{
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);

  if(Arrays.equals(c1,c2))
  {
    return true;
  }
  return false;

}



}




