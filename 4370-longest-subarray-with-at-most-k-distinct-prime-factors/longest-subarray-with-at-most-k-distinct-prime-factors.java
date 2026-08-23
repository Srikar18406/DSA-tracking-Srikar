class Solution {
    public int longestSubarray(int[] nums, int k) {
        int []spf = new int[100001];
        buildSPF(spf);
        int l = 0 , max = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int r = 0 ; r<nums.length ; r++){
            Set<Integer> fac = getFactors(nums[r] , spf);

            for(int prime : fac){
                map.put(prime, map.getOrDefault(prime, 0) + 1);
                }

            while(map.size()>k){
                Set<Integer> facs = getFactors(nums[l] , spf);
                for(int pr : facs){
                    map.put(pr , map.get(pr)-1);
                    if(map.get(pr)==0){
                        map.remove(pr);
                    }
                }
                l++;
            }
            max = Math.max(max , r-l+1);
        }
            return max;
        }
    public void buildSPF(int []spf){
        spf[1]=1;
        for(int i = 2 ; i<=100000 ; i++){
            if(spf[i]==0){
                spf[i] = i;
                for(long j = (long)i*i ; j<=100000 ; j+=i){
                    if(spf[(int)j]==0){
                        spf[(int)j] = i;
                    }
                }
            }
        }
    }
    public Set<Integer> getFactors(int x , int[] spf){
        Set<Integer> set = new HashSet<>();
        while(x!=1){
            int factor = spf[x];
            set.add(factor);
            while(x%factor==0){
                x /= factor;
            }
        }
        return set;
    }
}