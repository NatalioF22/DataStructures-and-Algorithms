package Sorting_Algorithms.Problems.SelectionSort;

public class App {
    public static void main(String[] args) {
        int[] unsortedNums = {1,6,4,3,2,7,9,8,5,4};
        Problems problem1 = new Problems(unsortedNums);
        int[] sortedArray = problem1.sortIntArray();
        for(int i: sortedArray){
            System.out.print(i + " ");

        }
        System.out.println();



        //Problem 2
       
        Problems problem2 = new Problems(sortedArray);
        int[] unsortedArray = problem2.unsortIntArray();
        for(int i: unsortedArray){
            System.out.print(i + " ");

        }
        System.out.println();
    }
    
}
