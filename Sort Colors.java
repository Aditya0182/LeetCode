class Solution {
    public void sortColors(int[] nums) {
        if(nums.length<=1){
            return;
        }
        int b[] = new int[nums.length/2];
        int c[] = new int[nums.length - b.length];
        for(int i = 0;i<nums.length/2;i++){
            b[i] = nums[i];
        }
        for(int i = nums.length/2 ; i<nums.length;i++){
            c[i-nums.length/2] = nums[i];
        }
        sortColors(b);
        sortColors(c);
        merge(b,c,nums);
    }
    public static void merge(int s1[], int s2[], int d[]){
        int i = 0;
        int j=  0;
        int  k=0;
        while(i<s1.length && j<s2.length){
            if(s1[i]<=s2[j]){
                d[k] = s1[i];
                i++;
                k++;
            }else{
                d[k] = s2[j];
                j++;
                k++;
            }
        }
            if(i<s1.length){
                while(i<s1.length){
                d[k] = s1[i];
                i++;
                k++;
                }
            }
             if(j<s2.length){
                while(j<s2.length){
                d[k] = s2[j];
                j++;
                k++;
            }
             }

    } 
}