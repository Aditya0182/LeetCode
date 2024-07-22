class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0,count2=0;
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(count1 ==0 && element2!=nums[i]){
                count1 = 1;
                element1= nums[i];
            }else if(count2==0 && element1 != nums[i]){
                count2 = 1;
                element2 = nums[i];
            }
            else if(nums[i] == element1){
                count1++;
            }else if(nums[i] == element2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
         List<Integer> ls = new ArrayList<>();
            count1 = 0;count2=0;
            for(int i = 0;i<n;i++){
                if(nums[i]==element1){
                    count1++;
                }else if(nums[i]==element2){
                    count2++;
                }
            }
                int mini = n/3;
                if(count1>mini){
                    ls.add(element1);
                }
                if(count2>mini){
                    ls.add(element2);
                } 
             
            return ls;
    }
}