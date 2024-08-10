class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        String result = "1";
        for (int i = 2; i <= n; i++) {
            result = getNextSequence(result);
        }
        return result;
    }

    private String getNextSequence(String s) {
        StringBuilder nextSequence = new StringBuilder();

        int i = 0;
        while (i < s.length()) {
            char currentChar = s.charAt(i);
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i + 1) == currentChar) {
                i++;
                count++;
            }
            nextSequence.append(count).append(currentChar);
            i++;
        }

        return nextSequence.toString();
    }
}
