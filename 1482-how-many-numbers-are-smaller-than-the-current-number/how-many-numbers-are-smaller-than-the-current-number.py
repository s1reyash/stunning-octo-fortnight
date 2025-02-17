class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        # dictionary
        # 1. sort banvacha
        # 2. craete dict 
        # 3. mg dict mandhe takacha   ( repeat value nhi yeil)
        # 4. last original cha index return kara cha , via dict 

        temp = sorted(nums)
        d ={}
        for i,num in enumerate(temp):
            if num not in d:
                d[num]=i
        ret = []
        for i in nums:
            ret.append(d[i])
        return ret
            

        
        
        