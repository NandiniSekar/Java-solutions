
import java.io.*;
import java.util.*;

class Solution {
 public static void main(String[] args){
int numRows = 3;
System.out.println(pascal(numRows));

}

public static List<List<Integer>> pascal(int numRows)
{

List<List<Integer>> result = new ArrayList<>();
if(numRows==0)
{
  return result;
}
List<Integer> row = new ArrayList<>();
row.add(1);
result.add(row);

List<Integer> Prevrow = row;
for(int i = 1;i<numRows;i++)
{
  List<Integer> Currentrow = new ArrayList<>();
  Currentrow.add(1);
  for(int j=1;j<i;j++)
  {
    Currentrow.add(Prevrow.get(j)+Prevrow.get(j-1));
  }
  Currentrow.add(1);
  result.add(new ArrayList<>(Currentrow));
  Prevrow = Currentrow;

}

 return result;
}


}
 
