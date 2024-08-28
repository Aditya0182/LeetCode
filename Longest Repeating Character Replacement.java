class Solution {
    public int characterReplacement(String s, int k) {
         Map<Character, Integer> map = new HashMap<>();

        int left=0, right=0; 
        int maxLength=0;
        int maxFreq = 0;

        while(right < s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));
            if(right-left+1 - maxFreq > k){
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }

            if((right-left+1)-maxFreq <= k){
                maxLength = Math.max(right-left+1, maxLength);
            }
            right++;
        }
        return maxLength;
    }
}