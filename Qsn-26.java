
import java.io.*;
import java.util.*;

class Solution {
  public static void main(String[] args) {
   int[] arr = {2,-1,1,2,2};
   System.out.println(lengthofloop(arr));

}

public static int lengthofloop(int[] arr)
{
  int n = arr.length;
  int looplength =0;
  int slow = 0, fast =0;

  slow = move(slow,arr,n);
  fast = move(fast,arr,n);
  fast = move(fast,arr,n);

  while(true)
  {
    if(slow==fast)
    {
      break;
    }

    if(slow<0 || slow>=n || fast<0 || fast>=n)
    {
      return -1;
    }
  }

  do{
    slow = move(slow,arr,n);
    looplength++;

  }while(slow!=fast);


  return looplength;
}

private static int move(int i,int[] arr,int n)
{
  if(arr[i]>=0)
  {
    return (i+arr[i])%n;
  }
  else
  {
    return (i-arr[i])%n;
  }
}


}

