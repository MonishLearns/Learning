package DSA.DP;

public class LCSub {
    static int Recursion(int n1, int n2, String s1, String s2, int[][] dp, int[] max1) {
        if (n1 < 0 || n2 < 0) {
            return 0;
        }
        if (dp[n1][n2] != -1) {
            return dp[n1][n2];
        }
        if (s1.charAt(n1) == s2.charAt(n2)) {
            dp[n1][n2] = 1 + Recursion(n1 - 1, n2 - 1, s1, s2, dp, max1);
            max1[0]= Math.max(max1[0],dp[n1][n2]);
            return dp[n1][n2];
        }
        return dp[n1][n2] = 0;
    }

    static int topDownRec(int n1, int n2, String s1, String s2, int[] max1) {
        int[][] dp = new int[n1 + 1][n2 + 1];
        for (int i = 0; i < n1 + 1; i++) {
            for (int j = 0; j < n2 + 1; j++) {
                dp[i][j] = 0;
            }
        }
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    max1[0]= Math.max(max1[0],dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return dp[n1][n2];
    }

    public static void main(String args[]) {
        // code to find the Longest common subsequence of given strings
        String s1 = "abcde";
        String s2 = "abced";
        int n1 = s1.length();
        int n2 = s2.length();
        int[] max1 = new int[1]; // Array with a single element
        int[][] dp = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                dp[i][j] = -1;
            }
        }
        Recursion(n1 - 1, n2 - 1, s1, s2, dp, max1);
        topDownRec(n1, n2, s1, s2, max1);
        System.out.println(max1[0]);
        // System.out.println(topDownRec(n1, n2, s1, s2, max1));
    }
}