import java.util.Arrays;

public class sort_0_1_problem {

    public static void sort(int[] array){
        int l,r;
        l=0;
        int tmp;
        r=array.length-1;

        while(l<r){
            if(array[l]==0){
                l++;
            } 
            else if (array[l]==1) {
                if(array[r]==0){
                    tmp = array[l];
                    array[l] = array[r];
                    array[r] = tmp;
                    l++;
                    r--;
                }
                else if(array[r]==1){
                    r--;
                }
            }
        }
    }


    public static void main(String[] args) {
        int [] nums ={0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
