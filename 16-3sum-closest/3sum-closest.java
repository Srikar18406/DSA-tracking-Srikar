class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int cs = nums[0]+nums[1]+nums[2];
        int minD = Math.abs(cs-target);
        
        for(int i = 0 ; i<nums.length ; i++){
            int l = i+1 , r = nums.length-1;
            while(l<r){
                int crs = nums[i] + nums[l] + nums[r];
                int D = Math.abs(crs-target);

                if(D<minD){
                    minD = D;
                    cs = crs;
                }
                if(crs<target){
                    l++;
                }
                else r--;
            }
        }
        return cs;
    }
}