class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        mp = {}
        n = len(nums)
        i=0
        while i<n and mp.get(nums[i],0)<1:
            mp[nums[i]] = mp.get(nums[i],0)+1
            i+=1
        if i==n:
            return False
        else:
            return True
