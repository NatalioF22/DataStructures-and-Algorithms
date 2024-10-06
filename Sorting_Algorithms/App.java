package Sorting_Algorithms;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] nums = {1,19,2,20,3,5,6,10,8,7,11};
        BubbleSort bSort = new BubbleSort(nums);
        int[] sortedArray = bSort.sort();
        System.out.println(Arrays.toString(sortedArray));
    }
}
