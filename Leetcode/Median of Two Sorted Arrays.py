class Solution(object):
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        list3 = nums1 + nums2
        list3.sort()
        if len(list3) % 2 != 0:
            l = int(len(list3)/2)
            return list3[l]
        else:
            l = int(len(list3)/2)
            return (list3[l]+list3[l-1])/2

obj1 = Solution()
print(obj1.findMedianSortedArrays([2],[]))
