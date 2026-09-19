class Solution {
    public static char getMaxOccuringChar(String s) {
        // Step 1: Frequency array for 26 lowercase letters
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        // Step 2: Find the max occurring character
        int maxFreq = 0;
        char result = 'a';

        // Loop from 0 to 25 ('a' to 'z'). 
        // Because we loop forward, if there's a tie, the alphabetically smaller character is kept!
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = (char) (i + 'a');
            }
        }

        return result;
    }
}