class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid;
        while(low<=high){
            mid = low + (high-low)/2; 
            if(nums[mid] == target) return mid;
            if(nums[low]<=nums[mid]) /*sorted part of the array*/ { 
                if(nums[low]<=target && target<nums[mid]) /* target is in the sorted part of the array*/ {
                    high = mid-1;
                }
                else /* target is in the second half of the array*/ {
                    low = mid+1;
                }
            }
            else /* sorted array is in the second part of the array  */ {
                if(nums[high]>=target && nums[mid]<target) /* target is in the sorted part of the array*/ {
                    low = mid+1;
                }
                else{ /* target is in the second half of the array*/
                    high = mid-1;
                }
            }
        }
        return -1;
            
    }   
}
