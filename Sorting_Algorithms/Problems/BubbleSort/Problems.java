package Sorting_Algorithms.Problems.BubbleSort;


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

    public String[] sortByWordsLength(){
        int arraySize = stringsArray.length;
        boolean swapped;
        for(int i=0;i<arraySize-1; i++){
            
            swapped = false;
            for(int j=0;j< arraySize -i -1; j++){
               
                if(stringsArray[j].length() > stringsArray[j+1].length()){
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

   
    public int[] sortByEveness() {
        boolean swapped;
        for (int i = 0; i < numsArray.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < numsArray.length - i - 1; j++) {
                if (isEven(numsArray[j]) && isEven(numsArray[j + 1])) {
                    // Both numbers are even, sort in ascending order
                    if (numsArray[j] > numsArray[j + 1]) {
                        swapNumbers(numsArray,j, j+1);
                        swapped = true;
                    }
                } else if (!isEven(numsArray[j]) && !isEven(numsArray[j + 1])) {
                    // Both numbers are odd, sort in ascending order
                    if (numsArray[j] > numsArray[j + 1]) {
                        swapNumbers(numsArray,j, j+1);
                        swapped = true;
                    }
                } else if (!isEven(numsArray[j]) && isEven(numsArray[j + 1])) {
                    // numsArray[j] is odd, numsArray[j + 1] is even, swap to move even number left
                    swapNumbers(numsArray,j, j+1);
                    swapped = true;
                }
                // If numsArray[j] is even and numsArray[j + 1] is odd, do nothing
            }
            // If no swaps occurred, the array is sorted
            if (!swapped) {
                break;
            }
        }
        return numsArray;
    }
    
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
  

    public String[] sortDates(){
        int arraySize = stringsArray.length;
        boolean swapped ;
        for(int i =0; i< arraySize; i++){
            swapped = false;
            
            for(int j = 0; j< arraySize - i - 1; j++){
                System.out.println(stringsArray[j]);
                int current_year = Integer.parseInt(stringsArray[j].substring(0, 4));
                int next_year = Integer.parseInt(stringsArray[j + 1].substring(0, 4));

                int current_month = Integer.parseInt(stringsArray[j].substring(5, 7));
                int next_month = Integer.parseInt(stringsArray[j+1].substring(5, 7));

                int current_day = Integer.parseInt(stringsArray[j].substring(8, 10));
                int next_day = Integer.parseInt(stringsArray[j+1].substring(8, 10));

                System.out.println(current_year);

                if(current_year > next_year){
                    swapStrings(stringsArray, j,j+1);
                    swapped = true;
                    if(current_month> next_month){
                        swapStrings(stringsArray, j,j+1);
                        swapped = true;
                        if(current_day> next_day){
                            swapStrings(stringsArray, j, j+1);
                        }
                    }
                }


            }
            if(!swapped){
                break;
            }
            }
            return stringsArray;
            

    }

    public void swapNumbers(int[] nums,int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public void swapStrings(String[] strings,int index1, int index2){
        String temp = strings[index1];
        strings[index1] = strings[index2];
        strings[index2] = temp;
    }
    
    

    
}
    