package Sorting_Algorithms.Problems.InsertionSort;

import java.security.Policy;

public class Problems {
    private int[] nums;
    private String[] stringsArray;
    private char[] charArray;

    public Problems(int[] nums){
        this.nums = nums;
    }

    public Problems(char[] chars){
        this.charArray = chars;
    }

    public Problems(String[] strings){
        this.stringsArray = strings;
    }

    public int[] sortedArrayInAscendentOrder(){
        int arraySize = nums.length;
        for(int i=0;i< arraySize; i++){
            int currentValue = nums[i];
            int previousIndex = i-1;
            while(previousIndex>=0 && nums[previousIndex] > currentValue){
                nums[previousIndex+1] = nums[previousIndex];
                previousIndex--;
            }
            nums[previousIndex+1] = currentValue;
        }
        return nums;

    }  



    public int[] sortedArrayInDescendentOrder(){
        int arraySize = nums.length;
        for(int i = 0;i<arraySize;i++){
            int currentValue = nums[i];
            int previousIndex = currentValue-1;
            while(previousIndex>=0 && nums[previousIndex]< currentValue){
                nums[previousIndex+1] = nums[previousIndex];
                previousIndex--;
            }
            nums[previousIndex+1] = currentValue;
        }
        return nums;
    }   

    public char[] sortArrayOfChars(){
        int arraySize = charArray.length;
        for(int i =0;i<arraySize;i++){
            int currentValue = charArray[i];
            int previousIndex = i-1;
            while(previousIndex>=0 && charArray[previousIndex]> currentValue){
                charArray[previousIndex +1] = charArray[previousIndex];
                previousIndex --;
            }
            charArray[previousIndex+1] = (char) currentValue;
        }
        return charArray;
    }


    public String[] sortWordsByLastChar() {
   // 4. Sort a list of words by their last letter: ["hello", "world", "algorithm", "computer", "science"]
        int arraySize = stringsArray.length;
        for(int i=0;i<arraySize;i++){
            String currentValue = stringsArray[i];
            int previousIndex = i-1;
            while(previousIndex>=0 && compareWords(currentValue, stringsArray[previousIndex]).equals(currentValue)){
                stringsArray[previousIndex+1] = stringsArray[previousIndex];
                previousIndex --;
            }
            stringsArray[previousIndex+1] = currentValue;
        }
        return stringsArray;
    }
  
    public String compareWords(String word1, String word2){
        int minLength = Math.min(word1.length(), word2.length());
        int word1Length = word1.length();
        int word2Length = word2.length();
        for(int i=0; i < minLength;i++){
            char letter1 = word1.charAt(word1Length-1);
            char letter2 = word2.charAt(word2Length-1);
            
            if( ((int) letter1) > ((int) letter2)){
                return word2;
            }
            else if(((int) letter1) < ((int) letter2)){
                return word1;
            }
            
        }
        return word1;
        
    }




}
