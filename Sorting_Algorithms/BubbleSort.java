package Sorting_Algorithms;

public class BubbleSort {
    private int[] nums;

    public BubbleSort(int[] nums) {
        this.nums = nums;
    }

    public int[] sort(){
        int n = this.nums.length;
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped = false;
            for(int j = 0;j<n-1-i;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
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
