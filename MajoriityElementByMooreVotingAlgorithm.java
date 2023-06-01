package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajoriityElementByMooreVotingAlgorithm
{
    public static int majorityElement(int []v)
    {

        int maj=v[0];
        int c=1;
        for(int i=0;i<v.length;i++)
        {
            if(maj==v[i])
            {
                maj=v[i];
                c++;
            }
            else {
                c--;
            }
        }
return maj;













        //size of the given array:
//        int n = v.length;
//        int cnt = 0; // count
//        int el = 0; // Element
//
//        //applying the algorithm:
//        for (int i = 0; i < n; i++)
//        {
//            if (cnt == 0)
//            {
//                cnt = 1;
//                el = v[i];
//            }
//            else if (el == v[i])
//                cnt++;
//            else
//                cnt--;
//        }
//
//        //checking if the stored element
//        // is the majority element:
//        int cnt1 = 0;
//        for (int i = 0; i < n; i++)
//        {
//            if (v[i] == el)
//                cnt1++;
//        }
//
//        if (cnt1 > (n / 2))
//            return el;
//        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7,1};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }
}
