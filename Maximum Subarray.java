class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int max1 = nums[0];
        for(int i = 1 ; i<nums.length;i++){
            max1 = Math.max(nums[i],max1+nums[i]);
            max = Math.max(max,max1);
        }
        return max;
    }
}                                                                                                                                                                                                                                                       