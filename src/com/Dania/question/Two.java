package com.Dania.question;

import java.util.HashMap;
import java.util.Map;

class Two {
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5,6};
        twoSum(arr,11);
    }
    public static int[] twoSum(int[] nums, int target)
    {
//        int[] outarr = new int[100];
//        int count = 0;
//
//        for (int i = 0; i < nums.length+1; )
//        {
//            for(int j=i+1;j<nums.length+2;j++)
//            {
//            if (nums[i] + nums[j] == target)
//            {
//              int coN=i;
//              int coM=j;
//
//             outarr.
//             outarr.p
//                i++;
//            }
//            else
//            {
//
//            }
//
//            }
//        }
//return outarr;
        int[] result = new int[2];
        // This map will store the difference and the corresponding index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // If we have seen the current element before
            // It means we have already encountered the other number of the pair
            if (map.containsKey(nums[i]))
            {
                // Index of the current element
                result[0] = i;
                // Index of the other element of the pair
                result[1] = map.get(nums[i]);
            }
            // If we have not seen the current before
            // It means we have not yet encountered any number of the pair
            else {
                // Save the difference of the target and the current element
                // with the index of the current element
                map.put(target - nums[i], i);
            }
        }
        return result;
    }

    }

