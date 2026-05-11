class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0] , crmax = nums[0] , crmin = nums[0];
        for(int i = 1 ; i<nums.length ; i++){
            int temp = crmax;
            crmax = Math.max(nums[i], Math.max(crmax * nums[i], crmin * nums[i]));
            crmin = Math.min(nums[i], Math.min(temp * nums[i], crmin * nums[i]));
            max = Math.max(max, crmax);
        }
        return max;
    }
}