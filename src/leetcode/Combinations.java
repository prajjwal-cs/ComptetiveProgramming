/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 07-05-2022
Time: 23:37
File: Combinations.java 

*/

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        if(n == 0 || k == 0) return null;
        List<List<Integer>> result = new ArrayList<>();
        long combinations = (long) Math.pow(2, n);
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = i+1;

        for(int ctr=0; ctr<combinations; ctr++) {
            List<Integer> comb = new ArrayList<>();
            for(int j=0; j<n; j++) {
                if((ctr & (1<<j)) >0 )
                    comb.add(nums[j]);
            }

            if(comb.size()==k)
                result.add(comb);
        }

        return result;
    }
}