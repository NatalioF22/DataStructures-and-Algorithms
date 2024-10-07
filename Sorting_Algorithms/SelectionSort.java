package Sorting_Algorithms;

public class SelectionSort {
    private int[] nums;

    public SelectionSort(int[] nums) {
        this.nums = nums;
    }

    public int[] sort(){
        int n = this.nums.length;

    for(int i = 0; i < n - 1; i++){  // Fixed the increment
        int minIndex = i;
        for(int j = i + 1; j < n; j++){
            if(nums[minIndex] > nums[j]){
                minIndex = j;  // Find the minimum index
            }
        }
        // Swap after the inner loop finishes
        int temp = nums[minIndex];
        nums[minIndex] = nums[i];
        nums[i] = temp;
    }
    return nums;

    }
    
    public long analyzeTime(){
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        System.out.println("Selection Sort Algorithm time: " + (endTime - startTime) + " nanoseconds.");
        return endTime - startTime;
    }
    
    
}
