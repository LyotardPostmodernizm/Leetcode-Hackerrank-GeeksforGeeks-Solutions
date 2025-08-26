class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right = s.length()-1;
        while(left<right){
            char firstChar = s.charAt(left);
            char lastChar = s.charAt(right);
            if(!Character.isLetterOrDigit(firstChar)) left++;
            else if(!Character.isLetterOrDigit(lastChar)) right--;
            else{
                if(Character.toLowerCase(firstChar)!=(Character.toLowerCase(lastChar))) return false;
                left++;
                right--;
            }
        }
    return true;
    }
}
