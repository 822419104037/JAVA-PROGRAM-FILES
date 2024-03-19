import java.util.Arrays;

public class Anagram
{
 public static void main (String[] Args)
 {
  String word1 = "race";
  String word2 = "care";
  boolean anagram = false;
  if(word1.length() != word2.length())
  {
   System.out.println("Not anagram");
  }
  else
  {
   char[] anagram1 = word1.toCharArray();
   char[] anagram2 = word2.toCharArray();
   Arrays.sort(anagram1);
   Arrays.sort(anagram2);
   anagram = Arrays.equals(anagram1,anagram2);
  }
  if(anagram == true)
  {
   System.out.println("Anagram");
  }
  else
  {
   System.out.println("Anagram");
  }
 }
}

   

  