class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0 ;
        int ans =0;
        int window =0;
        int n =nums.length;

        //ek loop -->window
        for(int right= 0; right< n; right++){
            //moving window
            window= window +nums[right];
            //if cindition not satisfy
            while(window + k < right-left+1){//right -left+1 =length of sub array
                window = window - nums[left]; //removing element from left
                left++;

            }
            //update the answer
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}