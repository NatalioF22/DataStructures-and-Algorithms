package Sorting_Algorithms.Problems.BubbleSort;
import java.util.Arrays;

public class Problems {
    private int[] numsArray;
    private String[] stringsArray;


    public Problems(int[] numsArray){
        this.numsArray = numsArray;
    }

    public Problems(String[] stringsArray){
        this.stringsArray = stringsArray;
    }

    public int[] solveUnsortedArray(){
        //1. Sort an array of integers in ascending order: [5, 2, 8, 12, 1, 6]
        int arraySize = this.numsArray.length;
        boolean swapped;
        for(int i=0;i< arraySize;i++){
            swapped = false;
            for(int j = 0; j< arraySize - i-1;j++){
                if(numsArray[j]> numsArray[j+1]){
                    int temp = numsArray[j+1];
                    numsArray[j+1] = numsArray[j];
                    numsArray[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return numsArray;

    }
    
    public int[] solveReverseUnsortedArray(){
        //2. Sort an array of integers in descending order: [15, 7, 3, 9, 14, 2]
        int arraySize = this.numsArray.length;
        boolean swapped;
        for(int i=0;i<arraySize-1;i++){
            swapped = false;
            for(int j = 0;j<arraySize-i-1;j++){
                if(numsArray[j]<numsArray[j+1] ){
                    int temp = numsArray[j+1];
                    numsArray[j+1] = numsArray[j];
                    numsArray[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return numsArray;
    }

    public void solveSortedStrings(){
        int arraySize = this.stringsArray.length;
        boolean swapped;
        for(int i=0; i<arraySize; i++){
            swapped = false;
            for(int j=0; j< arraySize-i-1;j++){
                String word = stringsArray[j];
                char letter = word.charAt(j);
                int ascii_value = (int) letter;
                System.out.println(word);
                
            }
        }

    }
    //3. Sort an array of strings alphabetically in reverse order: ["apple", "banana", "cherry", "date", "elderberry"]
    
}
