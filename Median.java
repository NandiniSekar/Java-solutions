import java.io.*;
import java.util.*;
 
import org.checkerframework.checker.units.qual.Length;
 
class Solution {
  public static void main(String[] args) {
   int[] arr1 = {2,3,5,8};
   int[] arr2 = {10,12,14,16,18,20};
   System.out.print(median(arr1,arr2));
  }
 
  public static int median(int[] arr1,int[] arr2)
  {  
    int[] arr3 = new int[arr1.length+ arr2.length];
    System.arraycopy(arr1,0,arr3,0,arr1.length);
    System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
    int n = arr3.length;
    if(n%2==0)
    {
      int mid1 = n/2;
      int mid2 = mid1-1;
      System.out.println("The median is: ");
      return (arr3[mid1] + arr3[mid2])/2;
    }
    else
    {
      System.out.println("The median is: ");
        return arr3[n/2];
    }
 
  }
 
}
 
