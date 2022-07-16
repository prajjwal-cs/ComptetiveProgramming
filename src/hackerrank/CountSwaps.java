/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 26-05-2022
Time: 14:52
File: CountSwaps.java */
package hackerrank;

import java.util.List;

public class CountSwaps {
    // count swaps during custom sort
    public static long howManySwaps(List<Integer> arr) {
        long swaps = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                    swaps++;
                }
            }
        }
        return swaps;
    }
}