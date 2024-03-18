class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i;
        int value;
        HashMap<Integer, Integer>map = new HashMap<>();
        for(i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                value = map.get(target-nums[i]);
                return new int[]{i,value};
            }
            map.put(nums[i],i);
        }
        return null;




    }
}
