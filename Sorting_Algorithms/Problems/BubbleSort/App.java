package Sorting_Algorithms.Problems.BubbleSort;

public class App {
    
public static void main(String[] args) {
    int[] unsrotedArray = {5, 2, 8, 12, 1, 6};
    int[] unsortedArray2  = {15, 7, 3, 9, 14, 2};
    String[] sortedStringArray = {"apple", "banana", "cherry", "date", "elderberry"};

    Problems problem1 = new Problems(unsrotedArray);
    Problems problem2 = new Problems(unsortedArray2);
    Problems problem3 = new Problems(sortedStringArray);
    

    int[] sortedArray = problem1.solveUnsortedArray();
    for(int i : sortedArray){
        System.out.print(i+ " ");
    }
    System.out.println();

    int[] unsortedArray = problem2.solveReverseUnsortedArray();
    for(int i : unsortedArray){
        System.out.print(i+ " ");
    }
    System.out.println();

    problem3.solveSortedStrings();

}
}
