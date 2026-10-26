class Solution {
    public int sumOfPrimesInRange(int n) {
        int nr=n;
        int r=0;
        
        while(nr!=0){
            int lastdigit=nr%10;
            r = r *10 +lastdigit;
            nr = nr / 10;
        }

        int start=Math.min(n,r);
        int end=Math.max(n,r);

        int sum=0;
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                sum=sum+i;
            }
        }

        
        return sum;
    }


    private boolean isPrime(int n){

            if(n<=1){
                return false;
            }

            for(int i=2;i<=n/i;i++){

                if(n%i == 0){
                    return false;
                }
            }
            return true;
        }
}