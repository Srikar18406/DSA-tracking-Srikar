class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer,Integer> m = new HashMap<>();
        for(int n : nums){
            m.put(n, m.getOrDefault(n, 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int f:m.keySet()){
            int frq = m.get(f);
            if(bucket[frq]==null){
                bucket[frq] = new ArrayList<>();
            }
            bucket[frq].add(f);
        }
        int[] res = new int[k];
        int c = 0;
        for(int i = bucket.length-1 ; i>=0 && c<k ; i--){
            if(bucket[i]!=null){
                for(int n : bucket[i]){
                    res[c++] = n;
                    if(c==k) break;
                }
            }
        }
        return res;
    }
}