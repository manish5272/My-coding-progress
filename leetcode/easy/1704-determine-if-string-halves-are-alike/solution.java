class Solution {
    public boolean halvesAreAlike(String s) {

        int i=0;
        int j=s.length()-1;
        int lcount=0;
        int rcount=0;

        Set<Character> set = Set.of('a','e','i','o','u','A','E','I','O','U');

        while(i<j){
            char lc = s.charAt(i);
            char rc = s.charAt(j);

            if(set.contains(lc)){
                lcount++;
            }
            if(set.contains(rc)){
                rcount++;
            }
            i++;
            j--;
        }
        if(lcount == rcount){
            return true;
        }
        return false;

    }
}