// https://www.geeksforgeeks.org/problems/rod-cutting

// Rod Cutting

class RodCutting {
    public int cutRod(int[] price) {
        // code here
        int n = price.length;
        int[] dp = new int[n+1];
        
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<=i; j++){
                dp[i] = Math.max(dp[i], price[j-1] + dp[i-j]);
            }
        }
        
        return dp[n];
    }
}
