class Solution {
    static boolean checkYear(int n) {
        
        
        boolean isleap;
        if(n % 400 == 0){
            isleap=  true;
        }
        else if(n % 100 == 0){
            isleap = false;
            
        }
        else if(n%4 == 0){
            isleap = true;
        }
        
        else{
            isleap=false;
        }
        
        return isleap;
        
    }
}