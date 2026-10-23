package Basic_Java_Coding.Prime_Numbers;

public class Count_Prime_Numbers_in_a_Range{
    public static void main(String args[]){
        int left = 10;
        int right = 20;

        int ans = countPrimes(left,right);
        System.out.println(ans);

    }


    public static int countPrimes(int left,int right){

        int count =0;
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;

    }

    private static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        for(int j=2;j<=n/j;j++){
            if(n%j == 0){
                return false;

            }
     
        }
    return true;
    }
    

}