
import java.io.*;
import java.util.*;

class Solution {
 public static void main(String[] args)
 {
  int n=4,k=2;
System.out.println(josephus(n,k));

 }

public static int josephus(int n,int k)
{

  int result = 0;
  for(int i=2;i<=n;i++)
  {
    result = (result + k )% i;
  }

    System.out.println("The number of person elected is: " );
  return result+1;
}


}
 
