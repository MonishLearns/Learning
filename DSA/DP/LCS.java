package Learning.DSA.DP;

public class LCS {
    static int Recursion(int n1, int n2,String s1,String s2, int[][] dp){
        if(n1<0 || n2 <0){
            return 0;
        }
        if(dp[n1][n2]!=-1){
            return dp[n1][n2];
        }
        if(s1.charAt(n1)==s2.charAt(n2)){
            return dp[n1][n2]=1+ Recursion(n1-1, n2-1, s1, s2,dp);
        }
        return dp[n1][n2]=Math.max(Recursion(n1-1, n2, s1, s2,dp),Recursion(n1, n2-1, s1, s2,dp));
    }

    static int topDownRec(int n1,int n2, String s1, String s2){
        int[][] dp = new int[n1+1][n2+1];
        for(int i=0;i < n1+1;i++){
            for(int j=0;j < n2+1;j++){
                dp[i][j] = 0;
            }
        }
        for(int i=1;i <= n1;i++){
            for(int j=1;j <=n2;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n1][n2];
    }


    public static void main(String args[]){
        // code to find the Longest common subsequence of given strings
        String s1 = "abcde";
        String s2 = "bacldme";
        int n1  = s1.length();
        int n2 = s2.length();
        int[][] dp = new int[n1][n2];
        for(int i=0;i < n1;i++){
            for(int j=0;j < n2;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(Recursion(n1-1,n2-1,s1,s2,dp));
        System.out.println(topDownRec(n1,n2,s1,s2));
    } 
}
