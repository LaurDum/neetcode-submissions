class Solution {
    public int search(int[] nums, int target) {
        int i= 0;
        for(int s : nums){
            if(s == target) return i;
            i++;
        }
return -1;
    }
}
