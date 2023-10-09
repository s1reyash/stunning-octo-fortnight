class Solution {
    public void moveZeroes(int[] nums) {
        int zoro =0;
        for(int i=0 ;i<nums.length;i++){
            if(nums[i] ==0){
                zoro++;
            }
            else if(zoro>0){
               int k = nums[i];
               nums[i]=0;
               nums[i-zoro]=k; 
            }

        }
        
    }
}