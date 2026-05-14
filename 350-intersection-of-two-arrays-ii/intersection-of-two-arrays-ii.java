class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map <Integer , Integer> m = new HashMap<>();
        for(int i = 0 ;i<nums1.length ; i++){
            if(m.containsKey(nums1[i])){
                m.put(nums1[i],m.get(nums1[i])+1);
            }
            else m.put(nums1[i] , 1);
        }
        List <Integer> l = new ArrayList<>();
        for (int x : nums2) {
            if (m.containsKey(x) && m.get(x) > 0) {
                l.add(x); 
                m.put(x, m.get(x) - 1); 
            }
        }
        int []res = new int[l.size()];
        int s = 0;
        for(int n : l){
            res[s++] = n;
        }
        return res;
    }
}