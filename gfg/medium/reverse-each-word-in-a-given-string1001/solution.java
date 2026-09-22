class Solution {
    public String reverseWords(String s) {
        // Code here
        
        
        String[] arr = s.trim().split("\\s+");
        
        for(int i = 0;i<arr.length;i++){
            
        StringBuilder sb = new StringBuilder(arr[i]);
        
        arr[i] = sb.reverse().toString();
            
        }
        
        
        return String.join(" ",arr);
    }
}
