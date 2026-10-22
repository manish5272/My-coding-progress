

public class Remove_Duplicates_from_a_Sorted_array_in_place {
    
    public static void main(String args[]){

        
        int[] nums ={1,1,4,4,5,5,6,7,7,8};
        for(int i=0;i<=nums.length-1;i++){

            System.out.print(nums[i]);
        }
        System.out.println();

        int rd = removeDuplicates(nums);

        for(int i=0;i<=rd;i++){
            System.out.print(nums[i]);
        }



    }

    public static int removeDuplicates(int[] nums){


        int rd=0;
        
        for(int i=1;i<=nums.length-1;i++){
            if(nums[rd] != nums[i]){
                rd++;
                nums[rd]=nums[i];
            }
        }
        return rd;



    }


}
