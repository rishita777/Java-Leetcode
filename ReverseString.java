package Leetcode;

import java.util.Scanner;

public class ReverseString
{
    public static String ReverseSent(String s)
{
    String newSen="";
   String newWords[]=s.split(" +");
    for(int i=newWords.length-1;i>=0;i--)
    {
        if(i==0)
        {
            newSen=newSen+ newWords[i];
        }
        else
            newSen=newSen+ newWords[i]+" ";
    }
   return newSen.trim();
}
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String word=sc.nextLine();
        String revSenten=  ReverseSent(word);
        System.out.println(revSenten);


    }
}
