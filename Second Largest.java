class Solution {
    public int print2largest(List<Integer> arr) {
        // Code Here
        int largest = arr.get(0);
        int slargest = -1;
        for(int i = 1 ; i<arr.size();i++){
            if(arr.get(i)> largest ){
            slargest = largest;
            largest=arr.get(i);
            }
            else if(arr.get(i)<largest && arr.get(i)> slargest){
                slargest = arr.get(i);
            }
        }
        return slargest;
    }
}