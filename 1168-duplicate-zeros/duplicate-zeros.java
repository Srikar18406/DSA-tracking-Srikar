class Solution {
    public void duplicateZeros(int[] arr) {
        int zc = 0;
        for(int n : arr){
            if(n==0) zc++;
        }
        int ri = arr.length -1;
        int wi = arr.length + zc -1;
        while(ri < wi) {
            if(arr[ri] == 0){
                if(wi < arr.length) arr[wi] = 0;
                wi--;
                if(wi < arr.length) arr[wi] = 0;
                wi--;
            } else {
                if(wi < arr.length) arr[wi] = arr[ri];
                wi--;
            }
            ri--;
        }
    }
}