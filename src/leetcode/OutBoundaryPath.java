/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 16-07-2022
Time: 16:41
File: OutBoundaryPath.java */
package leetcode;

public class OutBoundaryPath {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int max = 1000000000 + 7;
        int dp[][] = new int[m][n];
        dp[startRow][startColumn] = 1;
        int count = 0;
        for (int moves = 1; moves <= maxMove; moves++) {
            int[][] temp = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == m - 1)
                        count = (count + dp[i][j]) % max;
                    if (j == n - 1)
                        count = (count + dp[i][j]) % max;
                    if (i == 0)
                        count = (count + dp[i][j]) % max;
                    if (j == 0)
                        count = (count + dp[i][j]) % max;
                    temp[i][j] = (
                            ((i > 0 ? dp[i-1][j] : 0) + (i < m - 1 ? dp[i + 1][j] : 0)) % max +
                                    ((j > 0 ? dp[i][j-1] : 0) + (j < n - 1 ? dp[i][j + 1] : 0)) % max
                    ) % max;
                }
            }
            dp = temp;
        }
        return count;
    }
}