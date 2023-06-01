package Leetcode;

public class MaximumSubarray
{

        public static String shortestPalindrome(String s) {
            int n = s.length();
            String reverse = new StringBuilder(s).reverse().toString();

            for (int i = 0; i < n; i++) {
                if (s.substring(0, n - i).equals(reverse.substring(i))) {
                    return reverse.substring(0, i) + s;
                }
            }

            return "";
        }

        public static void main(String[] args) {
            String input = "abcd";
            String shortest = shortestPalindrome(input);
            System.out.println("Shortest palindrome sequence: " + shortest);
        }
    }


