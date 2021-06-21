class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        """
        :type s: str
        :rtype: int
        """
        store = []
        maxi = 0
        for x in s:
            if x not in store:
                store.append(x)
            else:
                i = store.index(x)
                store = store[i+1:]
                store.append(x)
            maxi = max(maxi, len(store))
        return maxi



sol = Solution()
print(sol.lengthOfLongestSubstring("tmzmuxtj"))
