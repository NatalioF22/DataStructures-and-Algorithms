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


    public String[] solveSortedStrings(){
        int arraySize = stringsArray.length;
        boolean swapped;
        for(int i=0; i<arraySize-1;i++){
            swapped = false;
            for(int j = 0;j<arraySize-i-1;j++){
                String word1 = stringsArray[j];
                String word2 = stringsArray[j+1];
                String leftWord = compareWords(word1, word2);
                if(!leftWord.equals(word1)){
                    String temp = stringsArray[j+1];
                    stringsArray[j+1] = stringsArray[j];
                    stringsArray[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return stringsArray;
    }


    public String compareWords(String word1, String word2) {
        int minSize = Math.min(word1.length(), word2.length());
        for (int i = 0; i < minSize; i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            if (c1 < c2) {
                return word1;
            } else if (c1 > c2) {
                return word2;
            }
            // If characters are equal, continue to the next character
        }
        // All compared characters are equal; the shorter word comes first
        if (word1.length() <= word2.length()) {
            return word1;
        } else {
            return word2;
        }
    }
    
}
    