class Solution {
    char firstRep(String S) {
       
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            
            for (int j = i + 1; j < S.length(); j++) {
                if (S.charAt(j) == ch) {
                    return ch; 
                }
            }
        }

        
        return '#';
    }
}