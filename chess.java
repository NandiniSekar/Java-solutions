
import java.io.*;
import java.util.*;


class Solution {
  public static void main(String[] args) {
 int br = 3;
 int bc = 5;
 int pr = 5;
 int pc = 7;
 System.out.println(chess(br,bc,pr,pc));
}

public static String chess(int br,int bc,int pr,int pc)
{
  if((br+bc)%2 != (pr+pc)%2)
  {
    return "NO"; //checking whether they are in same coloured squares
  }

  if((br==pr) && (bc==pc))
  {
    return "YES";  //Both bishop & piece are in same position
  }

  if(Math.abs(br-pr)== Math.abs(bc-pc))
  {
    return "Yes, 1";
  }
  return "Yes, 2";

}

}

