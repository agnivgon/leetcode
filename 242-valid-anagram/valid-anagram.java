class Solution {
    public boolean isAnagram(String s, String t) {
        

        // 1st approach
        // TC: O(N) and SC: O(N)
        // Check if both the string length are same
        // Then maintain a map of char and count, loop through each char in the string
        // keep adding occurence of char from a string and keep subtracting from the other
        // At the end if map values contain greater than 0 then it's not anagram
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charCountMap.put(s.charAt(i), charCountMap.getOrDefault(s.charAt(i), 0) + 1);
            charCountMap.put(t.charAt(i), charCountMap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int count : charCountMap.values()) {
            if (count > 0) {
                return false;
            }
        }
        return true;

        // 2nd approach
        // TC: O(N) and SC: O(1)
        // if (s.length() != t.length()) {
        //     return false;
        // }
        // int[] charCount = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        //     charCount[s.charAt(i) - 'a']++;
        //     charCount[t.charAt(i) - 'a']--;
        // }

        // for (int val : charCount) {
        //     if (count != 0) {
        //         return false;
        //     }
        // }
        // return true;

        // 3rd approah
        // TC: O(N log N) and SC: O(N)
        // char[] charS = s.toCharArray();
        // char[] charT = t.toCharArray();
        // Arrays.sort(charS);
        // Arrays.sort(charT);
        // return Arrays.equals(charS, charT);
    }
}