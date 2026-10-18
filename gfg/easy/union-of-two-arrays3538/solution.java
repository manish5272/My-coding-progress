class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>(set);
        
        for(int i=0;i<a.length;i++){
            
            int ele=a[i];
            set.add(ele);
        }
        
        for(int j=0;j<b.length;j++){
            int ele=b[j];
            set.add(ele);
            
        }
        
        // ArrayList<Integer> list=new ArrayList<>(set);
        
        for(int uni : set){
            list.add(uni);
        }
        
        return list;
        
    }
}