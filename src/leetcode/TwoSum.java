/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 16-07-2022
Time: 16:54
File: TwoSum.java */
package leetcode;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                break;
            }
            else if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[]{++left, ++right};
    }
}