import java.io.*;
import java.util.*;

class Solution {
  public static void main(String[] args) {
   int[] num ={11,81,91,41};
   System.out.println(secondlargest(num));
}

public static int secondlargest(int[] num)
{
  int temp = 0;
  for(int i =0;i<num.length;i++)
  {
    for(int j=i+1;j<num.length;j++)
    {
        temp = num[i];
        num[i]=num[j];
        num[j]=temp;
    }
  }

  return num[num.length-2];
}


}




