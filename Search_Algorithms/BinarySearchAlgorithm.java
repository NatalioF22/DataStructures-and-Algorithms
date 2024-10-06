package Search_Algorithms;

public class BinarySearchAlgorithm {
    private int[] nums;
    private int target;
    public BinarySearchAlgorithm(int[] nums, int target){
        this.target = target;
        this.nums = nums;
    }

    public int search(){

        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid_index = (start+end)/2;
            if(nums[mid_index]==target){
                return mid_index;
            } else if (nums[mid_index]> target) {
                end = mid_index -1;
            }
            else {
                start = mid_index +1;
            }
        }
        return -1;
    }
    public void analyzeTime(){
        long start_time = System.nanoTime();
        this.search();
        long end_time = System.nanoTime();
        System.out.println("The Binary Search Alogrithm took: " + (end_time-start_time) + " nanoseconds");

    }
}