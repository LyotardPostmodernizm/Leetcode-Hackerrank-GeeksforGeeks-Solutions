class Solution {
    public void reverseString(char[] s) {
        int i;
        char tmp;
        for(i=0;i<s.length/2;i++){
            tmp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = tmp;
        }
    }
}
