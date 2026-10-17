import java.util.ArrayList;
import java.util.List;

class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> numbers = new ArrayList<>();
        
       
        for (int i = 1; i < n; i++) {
            fact *= i;
        }
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        
        k = k - 1;
        StringBuilder ans = new StringBuilder();
        
        // 3. Mathematically extract each digit one by one
        while (true) {
            // Find the index of the next number to pick
            int idx = k / fact;
            ans.append(numbers.get(idx));
            
            // Remove the used number from the pool
            numbers.remove(idx);
            
            // Break when all numbers are picked
            if (numbers.isEmpty()) {
                break;
            }
            
            // Update k and calculate the next block size (factorial)
            k = k % fact;
            fact = fact / numbers.size();
        }
        
        return ans.toString();
    }
}
