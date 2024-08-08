class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> Count = new HashMap<>();

        for (char c : s.toCharArray()) {
            Count.put(c, Count.getOrDefault(c, 0) + 1);
        }
    
        for (char c : t.toCharArray()) {
            if (!Count.containsKey(c) || Count.get(c) == 0) {
                return false;
            }
            Count.put(c, Count.get(c) - 1);
        }

        return true;
    }
}
