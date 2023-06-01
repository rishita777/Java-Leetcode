package Leetcode;
import java.util.Scanner;
public class MultiplyStrings
{
    public static String multiply(String num1,String num2)
    {
        long mul=Long.parseLong(num1)*Long.parseLong(num2);
        String multi=String.valueOf(mul);
        return multi;
    }


    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st");
        String num1=scanner.nextLine();
        System.out.println("Enter 2nd");
        String num2=scanner.nextLine();
        String j=   multiply(num1, num2);

        System.out.println(j);


    }

}
