package interview;

public class SafePaths extends Thread{

    static int MOD = 1_000_000_007;

    public static int findSafeWays(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];

        // Base case
        if (grid[0][0] == 0) return 0;
        dp[0][0] = 1;

        // Fill first row
        for (int j = 1; j < m; j++) {
            if (grid[0][j] == 1)
                dp[0][j] = dp[0][j - 1];
            else
                dp[0][j] = 0;
        }

        // Fill first column
        for (int i = 1; i < n; i++) {
            if (grid[i][0] == 1)
                dp[i][0] = dp[i - 1][0];
            else
                dp[i][0] = 0;
        }

        // Fill the rest of the grid
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (grid[i][j] == 1) {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return dp[n - 1][m - 1];
    }

    // Sample driver code
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        System.out.println(findSafeWays(grid)); // Output: 10
    }
}
