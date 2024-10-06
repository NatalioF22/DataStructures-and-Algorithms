package Search_Algorithms;


public class App{
    public static void main(String[] args) {
        int[] nums  = new int[10000];
        for(int i=0; i<10000;i++){
            nums[i] = i;
        }
        int target = 899;
        BinarySearchAlgorithm bsa = new BinarySearchAlgorithm(nums,target);
        System.out.println(bsa.search());
        bsa.analyzeTime();

        LinearSearchAlgorithm lsa = new LinearSearchAlgorithm(nums, target);
        System.out.println(lsa.search());
        lsa.analyzeTime();

    }
}