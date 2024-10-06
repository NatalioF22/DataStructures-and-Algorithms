package Sorting_Algorithms;

public class SelectionSort {
    private int[] nums;

    public SelectionSort(int[] nums) {
        this.nums = nums;
    }

    public int[] sort(){
        int n = this.nums.length;
       
        for(int i =0; i< n-1;n++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex = j;
                }
                int temp = nums[minIndex];
                nums[minIndex] = nums[j];
                nums[i] = temp;
            }
        }
        return nums;

    }
    
    public long analyzeTime(){
        long startTime = System.nanoTime();
        this.sort();
        long endTime = System.nanoTime();

        System.out.println("Bubble Sort Algorithm time: "+ (endTime-startTime) + " nanoseconds.");
        return endTime - startTime;
    }
    
}
