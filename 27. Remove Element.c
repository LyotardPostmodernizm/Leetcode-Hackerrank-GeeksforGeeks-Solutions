int removeElement(int* nums, int numsSize, int val) {
    int i,index;
    index = 0;
    for(i=0;i<numsSize;i++){
        if(nums[i]!=val){
            nums[index] = nums[i];
            index++;
        }
        
    }

    return index;    
}
