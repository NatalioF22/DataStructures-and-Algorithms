package Sorting_Algorithms;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] nums = {100,1,19,2,20,3,5,6,10,8,7,11};
        BubbleSort bSort = new BubbleSort(nums);
        BubbleSort sSort = new BubbleSort(nums);

        int[] sortedArray = bSort.sort();
        int[] sortedArray2 = sSort.sort();

        System.out.println(Arrays.toString(sortedArray));
        System.out.println(bSort.analyzeTime());

        System.out.println(Arrays.toString(sortedArray2));
        System.out.println(sSort.analyzeTime());
    }
}
