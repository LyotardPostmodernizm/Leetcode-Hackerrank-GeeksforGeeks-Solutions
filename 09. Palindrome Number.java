class Solution {   //version 1
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int reverse = 0;
        int temp =x;
        int tmp;
        while(x>0){
            tmp = x%10;
            reverse=reverse*10+tmp;
            x=x/10;
        }
        if(temp == reverse) return true;
        else return false;

    }
}

class Solution {   //version 1: Traversing to the half of the integer
    public boolean isPalindrome(int x) {
        
        if (x < 0) return false;
        if (x != 0 && x % 10 == 0) return false;
        int reverse = 0;
        while (x > reverse) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return (x == reverse) || (x == reverse / 10);
    }
