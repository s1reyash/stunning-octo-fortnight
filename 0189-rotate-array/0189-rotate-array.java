class Solution {
    public static void reverse(int nums[],int i, int j){
        int li = i; //left index
        int ri =j; // right idex
        while(li<ri){ //swap
            int temp = nums[li];
            nums[li] = nums [ri];
            nums[ri]= temp;

            li++;
            ri--;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        // -ve + array.length
        if(k <0 ){
            k += nums.length;
        }

        //revesse part1
        reverse(nums, 0, nums.length -k-1);

        //reverse part2
        reverse(nums, nums.length -k ,nums.length -1);

        //complete reverse 
        reverse(nums, 0 , nums.length -1);
        }
    }