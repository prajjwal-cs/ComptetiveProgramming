/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 06-03-2022
Time: 17:15
File: DeleteAndEarn.java */
package dynamicprogramming;

import java.util.HashMap;

public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        int maxNumber = 0;

        HashMap<Integer, Integer> points = new HashMap<>();

        for (int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNumber = Math.max(maxNumber, num);
        }

        int one = 0;
        int two = 0;

        int n = points.size();

        if (maxNumber < n + n * Math.log(n) / Math.log(2)) {
            one = points.getOrDefault(1, 0);

            for (int i = 2; i < maxNumber; i++) {
                
            }
        }
        return 0;
    }
}