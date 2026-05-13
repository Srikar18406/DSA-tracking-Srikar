class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set <Integer> s = new HashSet<>();
       for(int i = 0 ; i<nums1.length ; i++){
            s.add(nums1[i]);
       }
       Set <Integer> res = new HashSet<>();
       for(int i = 0 ; i<nums2.length ; i++){
            if(s.contains(nums2[i])){
                res.add(nums2[i]);
            }
       }
       int []resarr = new int[res.size()];
       int k = 0;
       for(int n : res){
            resarr[k++] = n;
       }
       return resarr;
    }
}