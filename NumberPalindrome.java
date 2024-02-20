public class NumberPalindrome {
    // write code here
    public static boolean isPalindrome(int number){
        int tmp=0;
        int number2;
        if(number<0) number*=-1;
        number2=number;
        while(number>0){
            tmp+=number%10;
            number/=10;
            tmp*=10;
        }
        tmp/=10;
        if(number2==tmp)    return true;
        else return false;
    }
}
