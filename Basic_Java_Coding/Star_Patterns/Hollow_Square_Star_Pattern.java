package Basic_Java_Coding.Star_Patterns;



public class Hollow_Square_Star_Pattern{
    public static void main(String args[]){

        int n=6;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){

                if(j==1 || j==n){
                    System.out.print("*");
                }
                else if((i>1 && i<n) && (j>1 && j<n)){
                    System.out.print(" ");
                }

                else if(i==1 && (j>1 || j<n) || i==n && (j>1 || j<n)){
                    System.out.print("*");
                }
                
                


            }
            System.out.println();


        }
    }
}