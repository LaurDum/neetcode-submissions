class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> all=new HashMap<>();

       for (int i = 0; i < nums.length; i++){
            if(all.containsKey(nums[i])){
                return true;
            }
            all.put(nums[i], 1);
       }
       return false;
    }
}