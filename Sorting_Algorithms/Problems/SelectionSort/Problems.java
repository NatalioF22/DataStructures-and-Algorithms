package Sorting_Algorithms.Problems.SelectionSort;

public class Problems {
    private int[] numList;
    private String[] stringList;
    private char[] charList;
    public Problems(int[] nums){
        this.numList = nums;
    }

    public Problems(String[] strings){
        this.stringList = strings;
    }

    public Problems(char[] chars){
        this.charList = chars;
    }

    public int[] sortIntArray(){
        int arraySize = numList.length;
        for(int i = 0;i<arraySize-1;i++){
            int minIndex = i;
            for(int j = i+1; j<arraySize;j++){
                if(numList[minIndex]> numList[j]){
                    minIndex = j;
                }
            }
            int temp = numList[minIndex];
            numList[minIndex] = numList[i];
            numList[i] = temp;
        }
        return numList;
    }

    public int[] unsortIntArray(){
        int arraySize = numList.length;
        for(int i = 0;i < arraySize-1;i++){
            int minIndex = i;
            for(int j=i+1; j<arraySize;j++){
                if(numList[minIndex] < numList[j]){
                    minIndex = j;
                }
                
            }
            int temp = numList[minIndex];
            numList[minIndex] = numList[i];
            numList[i] = temp;
        }
        return numList;
    }





}
