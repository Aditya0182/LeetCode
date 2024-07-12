class Solution {
    public int romanToInt(String s) {
          int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentElement = checkSymbol(s.charAt(i));
            int nextElement = (i + 1 < s.length()) ? checkSymbol(s.charAt(i + 1)) : 0;
            
            if (currentElement < nextElement) {
                ans -= currentElement;
            } else {
                ans += currentElement;
            }
        }

        return ans;
    }

    private static int checkSymbol(char symbol) {
        switch (symbol) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
