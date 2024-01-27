class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        for i,j in enumerate(nums):
            if target - j in map:
                return [i,map[target-j]]
            else:
                map[j]=i
