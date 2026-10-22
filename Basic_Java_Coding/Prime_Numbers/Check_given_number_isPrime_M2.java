package Basic_Java_Coding.Prime_Numbers;

public class Check_given_number_isPrime_M2 {

    public static void main(String args[]){

        int n=13;

        if(n<=1){
            System.out.println("Not a prime number");
            return;
        }

        boolean isPrime = true;

        for(int i=2;i<n/2;i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("It is a prime number");

        }
        else{
            System.out.println("Not a prime number");
        }


    }
    
}
