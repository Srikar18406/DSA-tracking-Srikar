class Solution {
    public int dominantIndex(int[] nums) {
        int l = nums[0] , sl = nums[0] , li = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]>l){
                l = nums[i];
                li = i;
            }
        }
        for(int i = 0 ; i<nums.length ; i++){
            if(i!=li && nums[i]*2 > l){
                return -1;
            }
        }
        return li;
    }
}