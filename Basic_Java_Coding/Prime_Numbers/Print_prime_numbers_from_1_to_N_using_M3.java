package Basic_Java_Coding.Prime_Numbers;

public class Print_prime_numbers_from_1_to_N_using_M3 {

     public static void main(String args[]){



        for(int i=1;i<= 50;i++){

        int n=i;
        boolean isPrime = true;

        if(n<=1){
            isPrime = false;

        }
        else{

        
        for(int j=2;j<=Math.sqrt(n);j++){ //i<=Math.sqrt(n) THATS THE ONLY CHANGE TO REDUCE TIME COMPLEXITY
            if(n%j == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(n);

        }
    }
        


    }
}
    
}
