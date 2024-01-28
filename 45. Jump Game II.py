class Solution:
    def jump(self, nums: List[int]) -> int:
        n = len(nums)
        fi = n-1 #finish index
        ans = 0 #minimum number of jumps

        while fi>0:
            for si in range(0,n):
                if si + nums[si] >= fi:
                    ans +=1
                    fi = si
                    break
        return ans
