class Solution:
    def minTimeToVisitAllPoints(self, points: List[List[int]]) -> int:
        #restul = 0 
        #. assign the points and pop them
        # absolute dif fcalculate
        rest = 0
        x1, y1 = points.pop()

        while points:
            x2, y2 = points.pop()
            rest += max(abs(x2-x1) , abs(y2-y1))   
            x1 ,y1 = x2 ,y2
        return rest      