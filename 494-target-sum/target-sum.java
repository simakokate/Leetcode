class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       int sum=0;
       for(int num : nums){
        sum=sum+num;
       }

       if(Math.abs(target)>sum || (target+sum)%2!=0)
       {
        return 0;
       }
       int subsetsum=(target+sum)/2;

       // dp[i] = number of ways to form sum i
       int []dp= new int[subsetsum + 1];
       dp[0]=1;

       for(int num : nums)
       {
         for (int i = subsetsum; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }
        return dp[subsetsum];
       }
}