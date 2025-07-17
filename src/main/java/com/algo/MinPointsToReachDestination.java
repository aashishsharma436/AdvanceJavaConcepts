package com.algo;

/*
Given a m*n grid with each cell consisting of a positive, negative, or zero integer.
We can move across a cell only if we have positive points. Whenever we pass through a cell,
points in that cell are added to our overall points, the task is to find minimum initial points
to reach cell (m-1, n-1) from (0, 0) by following these certain set of rules :
1. From a cell (i, j) we can move to (i + 1, j) or (i, j + 1).
2. We cannot move from (i, j) if your overall points at (i, j) are <= 0.
3. We have to reach at (n-1, m-1) with minimum positive points i.e., > 0.
 */

public class MinPointsToReachDestination {
    public static void main(String[] args) {
        int points[][] = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        int m =3, n= 3;
        System.out.println(minPoints(points,m,n));
    }

    public static int minPoints(int grid[][], int m, int n) {
        int[][] dp = new int[m][n];

        /* Base case for destination
        At the destination (m-1, n-1), the knight needs at least 1 health point to survive, regardless of what the cell has.
        If the cell has a monster (e.g., -5), you’ll need more health to stay alive:*/

        dp[m - 1][n - 1] = Math.max(1, 1 - grid[m - 1][n - 1]);

        // Fill last row
        for (int j = n - 2; j >= 0; j--) dp[m - 1][j] = Math.max(1, dp[m - 1][j + 1] - grid[m - 1][j]);

        // Fill last column
        for (int i = m - 2; i >= 0; i--) dp[i][n - 1] = Math.max(1, dp[i + 1][n - 1] - grid[i][n - 1]);

        // Fill the rest of the table
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                int down = Math.max(1, dp[i + 1][j] - grid[i][j]);
                int right = Math.max(1, dp[i][j + 1] - grid[i][j]);
                dp[i][j] = Math.min(down, right);
            }
        }

        return dp[0][0];

    }
}
