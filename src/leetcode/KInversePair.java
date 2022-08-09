/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 18-07-2022
Time: 00:09
File: KInversePair.java */
package leetcode;

public class KInversePair {
    public int kInversePair(int n, int k) {
        int[][] dpArr = new int[n+1][k+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (j == 0) {
                    dpArr[i][j] = 1;
                }
                else {
                    for (int index = 0; index <= Math.min(j, i - 1); index++) {
                        dpArr[i][j] = (dpArr[i][j] - dpArr[i - 1][j - index]) % 100000007;
                    }
                }
            }
        }
        return dpArr[n][k];
    }
}