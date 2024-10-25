
import java.io.*;
import java.util.*;

class Solution {
 public static void main(String[] args){

String s1 = "10009";

String s2 = "";
for(int i=0;i<s1.length();i++)
{
   s2 =   s1.charAt(i) + s2;
}
System.out.println("The reversed string is: "+s2);

}


}
 
