class Solution {
    public boolean canPartition(int[] nums) {

int sum=0;
        // Calculate total sum
        for (int n : nums) {
            sum += n;
        }

        // If sum is odd, can't split into equal subsets
        if (sum % 2 != 0) return false;

        int target = sum / 2;

        // DP array
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        // Fill DP
        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }

        return dp[target];
    }
}