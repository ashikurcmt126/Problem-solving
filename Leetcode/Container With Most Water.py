'''
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
'''
class Solution:
    def max2(self, height: list[int])->int:
        '''
        start, k, max1 = 0, 0, 0
        for j in range(0, len(height)):
            start = height[j]
            for i in range(j + 1, len(height)):
                indexDif = (i - k) - j
                max1 = max(max1,(min(start, height[i]) * indexDif))
        return max1
        '''
        # Another way to solution
        start, end, maxi =0, len(height)-1,0
        while start < end:
            maxi = max(maxi, (min(height[start],height[end])*(end-start)))

            if height[start]<height[end]:
                start= start+1
            else: end= end-1
        return maxi

solution = Solution()
print(solution.max2([1,7,9,2,5,4,8,9,6]))
