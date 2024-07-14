class Solution {
    public static int largest(int n, int[] arr) {
        // code here
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            
        }
        return largest;
        
    }
}
