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

    public void sortStrings(){
    //33. Sort an array of fruits alphabetically: ["orange", "apple", "banana", "grape", "kiwi"]
    }

    public String compareWords(String word1, String word2){
        int minLength = Math.min(word1.length(), word2.length());
        for(int i =0; i<minLength;i++){
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            if(c1>c2){
                return word2;
            }else if(c1<c2){
                return word1;
            }
        }
        if(word1.length() <= word2.length()){
            return word1;
        }else{
            return word2;
        }

        

    }



}
