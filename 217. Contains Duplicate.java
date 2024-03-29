import java.util.HashMap; //Via HashMap
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;
        for(int num: nums){
            if(map.containsKey(num) && map.get(num) >= 1) return true;
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return false;
       
    }
}


import java.util.HashSet;  //Via HashSet
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
}
