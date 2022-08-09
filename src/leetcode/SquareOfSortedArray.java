/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 16-07-2022
Time: 16:44
File: SquareOfSortedArray.java */
package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class SquareOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(x -> x*x).sorted().toArray();
    }
}