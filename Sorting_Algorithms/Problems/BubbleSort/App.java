package Sorting_Algorithms.Problems.BubbleSort;

public class App {
    
public static void main(String[] args) {
    int[] unsrotedArray = {5, 2, 8, 12, 1, 6};
    int[] unsortedArray2  = {15, 7, 3, 9, 14, 2};
    String[] unsortedStringArray = {"elderberry", "date", "cherry", "banana", "apple"};
    String[] unsrotedStringsArrayByLength = {"cat", "elephant", "dog", "rhinoceros", "bird"};
    int[] unsrotedEvenNumbers = {2,3,1,4,5,8,9,6};

    Problems problem1 = new Problems(unsrotedArray);
    Problems problem2 = new Problems(unsortedArray2);
    Problems problem3 = new Problems(unsortedStringArray);
    Problems problem4 = new Problems(unsrotedStringsArrayByLength);
    Problems problem5 = new Problems(unsrotedEvenNumbers);
    

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

    String[] sortedStrings = problem3.solveSortedStrings();
    for(String i : sortedStrings){
        System.out.print(i+ " ");
    }
    System.out.println();

    //Problem 4

    String[] arraySortedByLength = problem4.sortByWordsLength();
    for(String i : arraySortedByLength){
        System.out.print(i+ " ");
    }
    System.out.println();

     //Problem 5

     int[] sortedEvenNums = problem5.sortByEveness();
     for(int i : sortedEvenNums){
         System.out.print(i+ " ");
     }
     System.out.println();
 


}
}
