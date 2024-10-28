

import java.io.*;
import java.util.*;


class Solution {
  public static void main(String[] args) {
   int bishoprow = 3;
   int bishopcol = 5;
   int piecerow = 5;
   int piececol = 7;
System.out.println(chessboaard(bishoprow,bishopcol,piecerow,piececol));

  }

  public static String chessboaard(int bishoprow,int bishopcol,int piecerow,int piececol)
  {
      if((bishoprow+bishopcol)%2 != (piececol+piecerow)%2)
      {
        return "NO";
      }
  if((bishoprow==piecerow) && (bishopcol==piececol))
  {
    return "Yes ,0";
  }

  if((bishoprow-piecerow)==(bishopcol-piececol))
  {
    return "Yes, 1";
  }

    return "Yes, 2";
  }

}

