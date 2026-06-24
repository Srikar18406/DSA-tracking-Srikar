class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int n : nums){
            s.add(n);
        }
        int longest = 0;
        for(int n : s){
            if(!s.contains(n-1)){
            int crrnum = n;
            int currlength = 1;
            while(s.contains(crrnum+1)){
                crrnum++;
                currlength++;
            }
            longest = Math.max(longest , currlength);
        }
        }
        return longest;
    }
}