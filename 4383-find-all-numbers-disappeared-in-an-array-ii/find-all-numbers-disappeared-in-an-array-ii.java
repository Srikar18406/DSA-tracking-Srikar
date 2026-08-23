class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> list = new ArrayList<>();
        int []hash = new int[upper+1];
        for(int x : nums){
            if(x>=lower && x<=upper){
                hash[x]=1;
            }
        }
        int i = lower;
        while(i<=upper){
            if(hash[i]==0){
                int si = i;
                while(i<=upper && hash[i]==0){
                    i++;
                }
                list.add(Arrays.asList(si,i-1));
            }
            else i++;
        }
        return list;
    }
}