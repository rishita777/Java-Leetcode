package Leetcode;

import java.util.Scanner;

public class Pallindrome
{

        public static boolean isPalindrome(int x)
        {
            int temp=x;
            int sum=0;
            while(x>0)
            {
                int r= x%10;
                sum= (sum *10)+r;
                x=x/10;
            }
            if(temp==sum)
            {
                System.out.println(sum);
                return true;
            }
            else {
                System.out.println(sum);
                return false;
            }


        }

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int n=sc.nextInt();
            boolean c=isPalindrome(n);
            if(c==true)
            {
                System.out.println("iTS A PALLINDROMe");
            }
            else
            {
                System.out.println("iTS not A PALLINDROMe");
            }

        }
    }

