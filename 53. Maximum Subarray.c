int maxSubArray(int* nums, int numsSize){ 
    int maxSum=-10000;    //Limits
    int currentSum=-10000;
    int i;
    for(i=0;i<numsSize;i++){
        currentSum= (nums[i] > currentSum+nums[i] ? nums[i] : currentSum+nums[i]);
        if(maxSum<currentSum)
            maxSum=currentSum;
        
    }
    return maxSum;
}
