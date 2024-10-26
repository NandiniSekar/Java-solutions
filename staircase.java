import java.io.*;
import java.util.*;

class Solution {
  public static void main(String[] args) {
 int n = 2;
 System.out.println(staircase(n));
}
public static int staircase(int n)
{
  if(n==0 || n==1)
  {
    return 1;
  }

  int[] dp = new int[n+1];
  dp[0]=1;
  dp[1]=1;

  for(int i=2;i<=n;i++)
  {
    dp[i] = dp[i-1] + dp[i-2];
  }

  return dp[n];
}

}





