package Leetcode;

import java.util.Scanner;

public class ValidPallindrome
{
    public static boolean isPalindrome(String s)
    {
        char ca[]=s.toCharArray();

        String  newSentence=s.replaceAll("[^a-zA-Z0-9]","");

        String newSenLow=newSentence.toLowerCase();
        int len=newSenLow.length();

        StringBuffer sb=new StringBuffer(newSenLow);
        String rev= String.valueOf(sb.reverse());
        System.out.println(rev);
        if(rev.equals(newSenLow))
        {  return true;}
        else
        {
            return false;
        }



    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String sen=sc.nextLine();
        boolean revString=  isPalindrome(sen);
        if(revString==true)
            System.out.println("is a palindrome ");

        else
            System.out.println("is not a palindrome");
    }
}
