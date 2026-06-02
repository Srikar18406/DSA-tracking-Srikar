class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer , Integer> m = new HashMap<>();
        m.put(0,1);
        int ps = 0 , res = 0;
        for(int i = 0 ; i<nums.length ; i++){
            ps += nums[i];
            if(m.containsKey(ps-k)){
                res+=m.get(ps-k);
            }
            m.put(ps , m.getOrDefault(ps,0) + 1);
        }
        return res;
    }
}
