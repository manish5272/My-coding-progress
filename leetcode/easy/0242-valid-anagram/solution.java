class Solution {
    public boolean isAnagram(String s, String t) {
       boolean isanagram = false;

       char[] sA = s.toCharArray();
       char[] tA = t.toCharArray();


       Arrays.sort(sA);
       Arrays.sort(tA);

       if(Arrays.equals(sA,tA)){
        isanagram = true;
       }
       

       return isanagram;
    }
}