class Solution {

    public String common(String s1, String s2){
        int n  = Math.min(s1.length(),s2.length());
        StringBuilder s = new StringBuilder();
        for(int i = 0;i<n;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                s.append(s1.charAt(i));
            }else{
                break;
            }
            
    
        }
        return s.toString();
    
    
    } 
        public String longestCommonPrefix(String[] strs) {
            String result = strs[0];
            for(int i = 1; i<strs.length;i++){
                result = common(result,strs[i]);
    
            }   
             return result;
            
        }
       
    }