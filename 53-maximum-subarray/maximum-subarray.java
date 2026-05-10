class Solution {
    public int maxSubArray(int[] nums) {
        int em = nums[0] , res = nums[0];
        for(int i = 1 ; i<nums.length ; i++){
            em = Math.max(em + nums[i] , nums[i]);
            res = Math.max(res,em);
        }
        return res;
    }
}