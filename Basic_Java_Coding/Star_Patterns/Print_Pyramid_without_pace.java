package Basic_Java_Coding.Star_Patterns;


public class Print_Pyramid_without_pace{
    public static void main(String args[]){

        int n=3;

        for(int i=n;i>=1;i--){

            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }

            for(int j=i*2-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}