class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        #1
        slow = nums[0]
        fast = nums[0]
        #2
        while True:
            slow=nums[slow] # 1 step samor index cha hisobani 
            fast=nums[nums[fast]] #2 step samor index cha samorcha index
            if slow == fast: # manje cycle form zali,
                break
        #3 kuthe form zali cycle
        fast=nums[0]
        while slow != fast:
            slow=nums[slow] # ek ek samor jail slow ani fast pointer
            fast=nums[fast] #
        return slow #duplicate element bhetla

