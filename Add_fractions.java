
import java.io.*;
import java.util.*;

class Solution {

  public static void main(String[] args) {
    int[] result = addfraction(1,3,3,9);
    System.out.print(result[0]+"/"+ result[1]);

}

public static int[] addfraction(int nr1,int dr1,int nr2,int dr2)
{
    int Denominator = dr1 * dr2;
    int Numerator = (nr1 * dr2) + (nr2 * dr1);
    int divisor = gcd(Numerator,Denominator);

  return new int[] {Numerator/divisor,Denominator/divisor};
}

public static int gcd(int a,int b)
{
  while(b!=0)
  {
    int temp = b;
    b=a%b;
    a=temp;
  }

return Math.abs(a);
}

}





