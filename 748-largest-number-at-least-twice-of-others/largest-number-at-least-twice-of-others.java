class Solution {
    public int dominantIndex(int[] nums) {
        int []dummy = nums.clone();
        Arrays.sort(dummy);
        int x=dummy[dummy.length-1] - (dummy[dummy.length - 2] *2);
        if(x>=0){
            for(int i = 0 ; i<nums.length ; i++){
                if(nums[i]==dummy[dummy.length - 1]) return i;
            }
        }
        return -1;
    }
}