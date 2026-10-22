package Basic_Java_Coding.Composite_Numbers;
import java.util.*;

public class Print_composite_Numbers_from_1_to_N {

    public static void main(String args[]){

        List<Integer> result = findComposite(10);
        System.out.println(result);

    }

    public static List<Integer> findComposite(int n){

        ArrayList<Integer> list = new ArrayList<>();

        boolean isComposite=false;
        for(int i = 1 ; i <= n ;i++){

            int v = i;
            if(v<=3){
                isComposite=false;
            }

            if(v>3){
                for(int j = 2 ; j <= v / j;j++){
                    if(v % j == 0){
                        isComposite=true;
                        break;

                    }
                    else{
                        isComposite=false;
                    }
                }

                if(isComposite){
                    list.add(v);
                }
            }

        }

        return list;

    }
    
}
