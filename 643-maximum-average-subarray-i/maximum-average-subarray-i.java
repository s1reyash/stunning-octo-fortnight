class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //get sum for starting window
        int sum =0;
        for(int i =0; i<k;i++){
            sum += nums[i];
        }
        int maxSum = sum;

        //start sliding

        int start =0;
        int end= k; //k size of window

        while( end < nums.length){
            //removing element
            sum -= nums[start];
            start++;

            //add next element
            sum+=nums[end];
            end++;

            //update sum
            maxSum = Math.max(maxSum,sum);

        }
        return (double) maxSum /k ;


    }
}