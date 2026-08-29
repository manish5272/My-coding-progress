class Solution { 
    public double average(int[] salary) { 
        int max = salary[0]; 
        int min = salary[0]; 
        double totalSum = 0; 

        // Find min, max, and total sum in a single pass
        for (int i = 0; i < salary.length; i++) { 
            if (salary[i] > max) { 
                max = salary[i]; 
            } 
            if (salary[i] < min) { 
                min = salary[i]; 
            } 
            totalSum += salary[i];
        } 

        // Subtract min and max from the total sum
        double targetSum = totalSum - min - max; 
        
        // Divide by total elements minus the 2 removed elements
        return targetSum / (salary.length - 2); 
    } 
}
