package Leetcode;

public class AreTheyPanagram
{
  static  public boolean checkIfPangram(String sentence)
    {
        return (isPangram(sentence)) ? true : false;
    }

    protected static boolean isPangram(String sentence)
    {
        String lowerSentence = sentence.toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++)
        {
            if (lowerSentence.indexOf(letter) < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Boolean s=checkIfPangram(" We promptly judged antique ivory buckles for the next prize");
        if(s==true)
            System.out.println("anargram");
        else System.out.println("not");

    }
}
