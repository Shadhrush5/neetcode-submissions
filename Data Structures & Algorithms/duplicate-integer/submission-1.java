class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Key is the numbers in the array and value is the count.
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}