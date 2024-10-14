package Search_Algorithms;

import java.util.LinkedList;

public class App{
    public static void main(String[] args) {
        int[] nums  = new int[10000];
        for(int i=0; i<10000;i++){
            nums[i] = i;
        }
        int target = 899;
        BinarySearchAlgorithm bsa = new BinarySearchAlgorithm();
        System.out.println(bsa.search(nums,target));
        bsa.analyzeTime();

        LinearSearchAlgorithm lsa = new LinearSearchAlgorithm(nums, target);
        System.out.println(lsa.search());
        lsa.analyzeTime();


    }
}