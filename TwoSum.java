package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum
{

        public static void twoSum(int[] nums, int target) {
            int[] ans = new int[2];

            for (int i = 0; i < nums.length - 1; ++i) {
                for (int j = i + 1; j < nums.length; ++j) {
                    if (nums[i] + nums[j] == target) {
                        ans[0] = i;
                        ans[1] = j;

                        break;
                    }
                }
            }

            System.out.println(Arrays.toString(ans));
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
        twoSum(arr,a1);

    }
}
