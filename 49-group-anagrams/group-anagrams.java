class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> m = new HashMap<>();
        for(String s : strs){
            int [] hash = new int[26];
            for(char c : s.toCharArray()){
                hash[c - 'a'] ++;
            }

            StringBuilder sb = new StringBuilder();
            for(int c : hash){
                sb.append(c);
                sb.append(",");
            }
            String key = sb.toString();

            if(!m.containsKey(key)){
                m.put(key, new ArrayList<>());
            }
            m.get(key).add(s);
        }
        return new ArrayList<>(m.values());
    }
}