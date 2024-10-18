/******************************************************************************
Distance between 2 words in a string[]
 
*******************************************************************************/
 
public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	String[] words = {"Nandini" ,"kind","is","a","kind","person","Nandini"};
	String word1 = "Nandini";
	String word2 = "person";
    System.out.println(minimumdistance(words,word1,word2));
	}
    public static int minimumdistance(String[] words,String word1,String word2)
    {
        int index1 = -1;
        int index2 = -1;
        int distance = Integer.MAX_VALUE;
    for(int i=0;i<words.length;i++)
    {
        if(words[i].equals(word1))
        {
            index1 = i;
        }
        if(words[i].equals(word2))
        {
            index2 = i;
        }
    }
     if(index1 != -1 && index2 != -1)
     {
         distance = Math.min(distance,Math.abs(index1 - index2));
     }
        return distance;
    }

}
