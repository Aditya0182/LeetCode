class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> ans = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (ans.containsKey(target - num)) {
                return new int[] { i, ans.get(target - num) };
            }
            ans.put(num, i);
        }

        return new int[] {};        
    }
}