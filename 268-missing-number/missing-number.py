class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        return sum(range(len(nums)+1))-sum(nums)
        

        #Logic ka Breakdown:
"""Total Sum Calculate karo:
Pura sequence 0 se n tak ka sum nikal sakte hain using sum(range(n+1)).

Example:
python
Copy
Edit
sum(range(4))  # 0 + 1 + 2 + 3 = 6
Given List ka Sum Nikalo:

Example:
python
Copy
Edit
sum([3, 0, 1])  # 3 + 0 + 1 = 4
Missing Number Nikalne ka Formula:

python
Copy
Edit
Missing Number = (Total Sum) - (Given List ka Sum)
Yahan:
python
Copy
Edit
6 - 4 = 2
Toh output 2 aa gaya."""