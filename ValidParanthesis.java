package Leetcode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis
{
    static public int solve(String s)
    {

        Stack<Character> paranthStatck = new Stack();
        for (char c : s.toCharArray())
        {
            if (c == '(' || c == '[' || c == '{')
                paranthStatck.push(c);

            else {
                if (paranthStatck.isEmpty())
                    return 0;
                if( (c == ')' && paranthStatck.peek() != '(') ||(c == ']'
                              && paranthStatck.peek() != '[')||(c == '}'
                              && paranthStatck.peek() != '{'))
                    return 0;

                paranthStatck.pop();


            }



        }
        if (paranthStatck.size() == 0)
            return 1;
        else return 0;

    }


    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your desired string");
        String st=sc.next();
        int  sol= solve(st);
        if(sol==1)
        {
            System.out.println("balanced");
        }
        if(sol==0)
        System.out.println("Not balanced");
    }
}
