import java.io.*;
import java.util.*;

class Solution {
  public static void main(String[] args) {
  int[] num1 = {1,2,3,4};
  int[] num2 = {8,9,3,4};
  //o/p: 3+4 = 7
  System.out.println(mergearray(num1,num2));
}

public static int mergearray(int[] num1,int[] num2)
{
  List<Integer> l1 = new ArrayList<>();
  for(int i=0;i<num1.length;i++)
  {
    l1.add(num1[i]);
  }
  List<Integer> l2 = new ArrayList<>();
  for(int j=0;j<num2.length;j++)
  {
    l2.add(num2[j]);
  }

  l1.retainAll(l2);
  int ans = 0;
  for(int i =0;i<l1.size();i++)
  {
      ans = ans+l1.get(i);
  }

  System.out.print("The sum of common elements is: ");
  return ans;
}

}




