class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i = 0;
        int time = 0;
        while(true){
            if(tickets[i]>0){
                tickets[i]--;
                time++;
            }
            if(i==k&&tickets[i]==0){
                return time;
            }
            i = (i+1)%tickets.length;
        }
    }
}