import java.util.Arrays;

public class sort_0_1_2_problem {

    public static void sort(int[] nums){
        int i,l,r,tmp;
        i=0;
        l=0;
        r=nums.length-1;
        
        while(i<=r){
            if(nums[i]==0){
                tmp=nums[i];
                nums[i]=nums[l];
                nums[l]=tmp;
                i++;
                l++;
            }
            else if(nums[i]==1)
                i++;
            else{           //nums[i]=2
                tmp=nums[i];
                nums[i]=nums[r];
                nums[r]=tmp;
                r--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
