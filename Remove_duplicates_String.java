import java.io.*;
import java.util.*;

class Solution {
  public static void main(String[] args) {
  
  String[] s1 = {"Sekar","Arvi","Arvi","Abhinav"};
  System.out.println(removeduplicates(s1));
}

public static HashSet<String> removeduplicates(String[] s1)
{
HashSet<String> set = new HashSet<>();
for(int i =0;i<s1.length;i++)
{
  set.add(s1[i]);
}

return set;
}

}




