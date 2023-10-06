class Solution {
    public int maxProfit(int[] prices) {
        int n = Integer.MAX_VALUE;
        int op =0;
        int prlist =0;
        for (int i= 0 ; i<prices.length; i++){
            if (prices[i]< n){
                n= prices[i];
            }
            prlist = prices[i]-n ;
            if(op<prlist){
                op =prlist;
            }
        } 
        return op;
    }
}