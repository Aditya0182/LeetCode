class Solution {
    public int[] sortArray(int[] nums) {
        // Selection Sort
        // int index;
        // for(int i = 0 ; i<nums.length-1;i++){
        // index = i;
        // for(int j =i+1;j<nums.length;j++){
        // if(nums[j]<nums[index]){
        // index =j;
        // }
        // }
        // int temp = nums[index];
        // nums[index] = nums[i];
        // nums[i] =temp;
        // }
        // return nums;

        // Bubble Sort
        // for(int i = 0 ; i <nums.length-1;i++){
        // for(int j = 0;j<nums.length-1;j++){
        // if(nums[j+1]<nums[j]){
        // int temp = nums[j+1];
        // nums[j+1] = nums[j];
        // nums[j] = temp;
        // }
        // }
        // }
        // return nums;

        // Insertion Sort
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
        return nums;
    }
}