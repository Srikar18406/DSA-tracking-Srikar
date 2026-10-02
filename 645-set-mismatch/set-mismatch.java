class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int ts = (n*(n+1))/2;
        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            sum+=nums[i];
        }
        Set<Integer> set = new HashSet<>();
        int dn = nums[0];
        for(int a : nums){
            if(set.contains(a)){
                dn = a;
            }
            else set.add(a);
        }
        int mn = ts - (sum - dn);
        return new int[] {dn , mn};
    }
}