class Solution {
    int mod = 1000000007;
    
    int rem(int s, int e, int current, int k, int[][] dp){
        if(k == 0){
            if(current == e) return 1;
            return 0;
        }
        if(dp[current+1001][k] != -1){
            return dp[current+1001][k];
        }
        
        int a = rem(s, e, current+1, k-1, dp)%mod;
        int b = rem(s, e, current-1, k-1, dp)%mod;
        
        return dp[current+1001][k] = (a+b)%mod;
        
    }
    
    public int numberOfWays(int s, int e, int k) {
        int[][] dp = new int[3002][1001];
        for(int[] item : dp){
            Arrays.fill(item, -1);
        }
        return rem(s, e, s, k, dp);
    }
}