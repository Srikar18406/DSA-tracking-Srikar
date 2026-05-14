class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        int [][]res2d = new int[n][n];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<=i ; j++){
                if(j==0||i==j){
                    res2d[i][j]=1;
                }
                else{
                    res2d[i][j] = res2d[i-1][j-1] + res2d[i-1][j];
                }
            }
        }
        List<List<Integer>> finalResult = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(res2d[i][j]);
            }
            finalResult.add(row);
        }

        return finalResult;
    }
}