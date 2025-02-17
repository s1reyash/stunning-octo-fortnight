class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        set_nums= set(nums) #create set
        ret =[] # create a empty

        for i in range (1 , len(nums)+ 1):
            if i not in set_nums : # if nahi ahe tr aad to ret and then print 
                ret.append(i)
        return ret
        