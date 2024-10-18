import java.io.*;
import java.util.*;
 
class Solution {
  public static void main(String[] args) {
  String s1 = "abbccc";
  //System.out.print(freq(s1));
 
  HashMap<Character,Integer> hm = new HashMap<>();
for(int i =0;i<s1.length();i++)
{
      char c = s1.charAt(i);
      if(hm.containsKey(c))
      {
        int count = hm.get(c);
        count=count+1;
        hm.replace(c,count);
      }
      else
      {
        hm.put(c,1);
      }
}
    for(char keys :hm.keySet() )
    {
        System.out.print(keys+""+hm.get(keys));
    }
  }
 
 
  }
 
