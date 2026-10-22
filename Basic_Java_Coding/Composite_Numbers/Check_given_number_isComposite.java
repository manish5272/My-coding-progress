package Basic_Java_Coding.Composite_Numbers;

public class Check_given_number_isComposite {

    public static void main(String args[]){

        int n=2;
        boolean isComposite = false;


        if(n<=3){
            isComposite = false;
        }
        else{

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                isComposite=true;
                break;
            }
        }

    }
        System.out.println(isComposite);
    }
    
}
