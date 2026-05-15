class Solution {
    public int search(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);
    }
    public int bs (int []nums , int l , int h , int t){
        if(l>h) return -1;
        int mid = l + (h-l)/2;
        if(nums[mid]==t) return mid;

        if(nums[l] <= nums[mid]){
            if(t>=nums[l] && t<nums[mid]){
                return bs(nums,l,mid-1,t);
            }
            else return bs(nums,mid+1,h,t);
        }
        else {
            if(t<=nums[h] && t > nums[mid]){
                return bs(nums,mid+1,h,t);
            }
            else return bs(nums,l,mid-1,t);
        }
    }
}