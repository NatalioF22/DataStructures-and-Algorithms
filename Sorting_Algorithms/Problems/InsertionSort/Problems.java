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

  





}
