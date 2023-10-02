class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int zero =1 ,ans =0;
        for (int i = 0 ;i<flowerbed.length ;i++){
            if(flowerbed[i]== 0 ){
                ++zero;
            }else{
                 ans += (zero -1)/2;
                 zero =0;
            }
        } 
        return ans +zero / 2 >=n;
    }    
}
