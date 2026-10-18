// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Reverse_an_array_using_two_pointers{
    
    public static void main(String[] args) {
        

int arr[]= {210,7,9,3,1,5,139} ;
    
    int i= 0;
        int j = arr.length-1;

while (i<j){

int temp = arr[i];

arr[i] = arr[j];

arr[j] = temp;

i++;

j--;
}

System.out.println("After reversing the Origind Array");

for(i=0; i < arr.length;i++){

System.out.print(arr[i]+" ");

}
    
}}