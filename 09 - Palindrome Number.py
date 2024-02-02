class Solution:
    def isPalindrome(self, x: int) -> bool:
        reversed_num = 0
        original = x
        
        if x < 0:
            return False

        while original != 0:
            tmp = original%10
            reversed_num = reversed_num*10 + tmp
            original = original // 10

        if x == reversed_num:
            return True
        else:
            return False

        
