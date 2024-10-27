
import java.io.*;
import java.util.*;

class Solution {
  public static void main(String[] args) {
   int n =100;
   System.out.println(bulbs(n));
}

public static int bulbs(int n)
{
  boolean[] bulb = new boolean[n+1];

  for(int i=1;i<=n;i++)
  {
    for(int j=i;j<=n;j=j+i)
    {
      bulb[j]=!bulb[j];
    }
  }
int count=0;
for(int i=1;i<=n;i++)
{
  if(bulb[i])
  {
    count++;
  }
}


  return count;
}

}



