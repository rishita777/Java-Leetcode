package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTwoSum
{
    static int[] hashmaptwoSum(int num[],int target) {

        Map<Integer, Integer> input = new HashMap<Integer, Integer>();
        for (int i = 0; i < num.length; i++) {
            input.put(num[i], i);
            System.out.println(input);

        }

        for (int i = 0; i < num.length; i++) {
            int second = target - num[i];
            if (input.containsKey(second)) {
                return new int[]{input.get(second), i};
            } else input.put(num[i], i);
        }
        throw new IllegalArgumentException("no ");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        System.out.println("Enter numbers");
        int[] arr = new int[n];

        for(int i=0;i<=n-1;i++)
        {

            arr[i] = sc.nextInt();

        }
        System.out.println("Enter target");
        int a1 = sc.nextInt();
        hashmaptwoSum(arr,a1);
        System.out.println(Arrays.toString(hashmaptwoSum(arr,a1)));
    }
}
