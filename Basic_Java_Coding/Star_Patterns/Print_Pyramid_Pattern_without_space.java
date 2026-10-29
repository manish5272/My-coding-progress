package Basic_Java_Coding.Star_Patterns;

public class Print_Pyramid_Pattern_without_space {
    public static void main(String args[]){

    

    int n=3;

    for(int i=1;i<=n;i++){

        for(int k=1;k<=n-i;k++){
            System.out.print(" ");
        }
        
        //HERE ONLY THE J<=2*I-1 IS THE ONLY CHANGE FROM WITH SPACE

        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    
}
}