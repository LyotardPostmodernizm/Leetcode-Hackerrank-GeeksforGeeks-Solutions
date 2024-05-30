class Solution {
    public int trailingZeroes(int n) {
        int tmp=5;
        int sum=0;
        while(tmp<=n){
            sum+=n/tmp;
            tmp*=5;
        }

        return sum;
    }
}
