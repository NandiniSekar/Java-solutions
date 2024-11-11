
import java.io.*;
import java.util.*;
import java.util.Arrays;
//find minimum in an unsorted array. Not rotated and all.

class Solution {
  public static void main(String[] args) {
     int[] num = {5,6,1,2,3,-4};
     System.out.println(minimum(num));

}

public static int minimum(int[] num)
{
  int min = num[0];
  for(int i=0;i<num.length;i++)
  {
    if(num[i]<min)
    {
      min = num[i];
    }
  }

  return min;
}

}

   



