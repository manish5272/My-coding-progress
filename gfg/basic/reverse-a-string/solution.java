class Solution {
    public static String reverseString(String s) {
        
        
        
        
        if(s.length() <=1){
            return s;
        }
        
        int i=0;
        int j=s.length()-1;
        
            char[] arr = s.toCharArray();
            
            while(i<j){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            
            return new String(arr);

        
    }
}