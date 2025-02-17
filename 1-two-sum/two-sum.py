class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #solving by hashmap
        #logic : target - current number = should be prsent in the array 
        #and finally return the indexx of the current number and the (targrt - current )
        hashMap = {} #var ,index
        for index,var in enumerate(nums):
            diff = target - var

            if diff in hashMap:
                return [index ,hashMap[diff]]
            hashMap [var]= index

