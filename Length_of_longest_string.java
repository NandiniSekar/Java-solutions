import java.io.*;
import java.util.*;
 
class Solution {
  public static void main(String[] args) {
    String[] dict = {"CODGE","ODG","LODGES","SODG","dode","mODJ","LODGESSSS"};
    String Tosearch = "ODG";
    System.out.println(lengthoflongest(dict,Tosearch));
  }
 
  public static int lengthoflongest(String[] dict,String Tosearch)
  {
    int max = Integer.MIN_VALUE;
    for(int i=0;i<dict.length;i++)
    {
      if(dict[i].contains(Tosearch))
      {
          max = Math.max(max,dict[i].length());
      }
    }
 
    System.out.print("The length of the longest string is: ");
    return max;
  }
 
 
 
}
 
