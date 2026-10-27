class Solution {
    public void rightPattern(int n) {
        
        
        for(int i=1;i<=n;i++){
            
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}