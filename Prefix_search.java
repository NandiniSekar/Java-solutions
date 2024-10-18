class Solution {
  public static void main(String[] args) {
     String[] arr = {"apple", "applet", "bread", "aper"};
    String prefix = "app";
    System.out.print(prefixsearch(arr,prefix));
  }
 
  public static List<String> prefixsearch(String[] arr,String prefix)
  {
    List<String> result = new ArrayList<>();
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i].startsWith(prefix))
      {
          result.add(arr[i]);
      }
    }
    return result;
 
  }
}
 
