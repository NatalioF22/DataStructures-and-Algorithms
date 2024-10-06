package Search_Algorithms;

public class LinearSearchAlgorithm {

    private int[] nums;
    private int target;
    public LinearSearchAlgorithm(int[] nums, int target){
        this.target = target;
        this.nums = nums;
    }

    public int search(){

       for(int i=0; i< this.nums.length; i++){
            if(nums[i] == target){
                return i;
            }
       }
       return -1;
    }
    public void analyzeTime(){
        long start_time = System.nanoTime();
        this.search();
        long end_time = System.nanoTime();
        System.out.println("The Linear Search Alogrithm took: " + (end_time-start_time) + " nanoseconds");

    }
}
