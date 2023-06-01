package Leetcode;

import java.util.Arrays;
import java.util.List;

public class MajorityElementByList
{
    public static int majorityElement(final List<Integer> A)
    {

        int[] arr = A.stream().mapToInt(i -> i).toArray();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            //selected element is v[i]
            int cnt = 0;
            for (int j = 0; j < n; j++)
            {
                // counting the frequency of v[i]
                if (arr[j] == arr[i]) {
                    cnt++;
                }
            }

            // check if frquency is greater than n/2:
            if (cnt > (n / 2))
                return arr[i];
        }

        return -1;
    }

    public static void main(String args[]) {
        // int[] arr = {2, 2, 1, 1, 1, 2, 2};
        List<Integer> arr= Arrays.asList(2, 2, 1, 1, 1, 2, 2);
        int ans= majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }
}
