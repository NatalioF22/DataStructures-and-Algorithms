package Sorting_Algorithms.Problems.InsertionSort;
import java.util.HashMap;;

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
        for(int i=1;i< arraySize; i++){
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
        for(int i = 1;i<arraySize;i++){
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
        for(int i =1;i<arraySize;i++){
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
        for(int i=1;i<arraySize;i++){
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
        for(int i=1; i < minLength;i++){
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


    public int[] sortArrayByAbsoluteValue(){
    //5. Sort an array of integers, but keep all negative numbers at their original positions: [4, -2, 9, 1, -5, 6, 3, -8]
        int arraySize = nums.length;
        for(int i=1;i<arraySize; i++){
            int currentValue = nums[i];
            int previousIndex =i-1;
            while (previousIndex>=0 && Math.abs(nums[previousIndex])> Math.abs(currentValue))  {
                nums[previousIndex+1] = nums[previousIndex];
                previousIndex--;
            }
            nums[previousIndex+1] = currentValue;
        }
        return nums;
    }

    public String[] sortIpAddresses(){
        //6. Sort a list of IP addresses in ascending order: ["192.168.0.1", "10.0.0.1", "172.16.0.1", "192.168.1.1"]
        int arraySize = stringsArray.length;
        for(int i=1;i<arraySize;i++){
            String currentValue =stringsArray[i];
            int previousIndex = i-1;
           
            while(previousIndex>=0 && compareIpAddresses(stringsArray[previousIndex], currentValue) >0){
                    stringsArray[previousIndex+1] = stringsArray[previousIndex];
                    
                    previousIndex--;
            }
            stringsArray[previousIndex +1 ] = currentValue;
         
        }
        return stringsArray;

    }

    public int compareIpAddresses(String ip1, String ip2){
        String[] ip1Parts = ip1.split("[\\.]");
        String[] ip2Parts = ip2.split("[\\.]");

        for(int i=0; i<4; i++){
            int address1 = Integer.parseInt(ip1Parts[i]);
            int address2 = Integer.parseInt(ip2Parts[i]);
            //In each parts of the ip are equal return 0, other wise return their difference. 
            //If the difference is greather than zero, this means that address 2 is greather and it should saty in place, otherwise switch.
            if(address1 != address2){
                return address1-address2;
            }       
        }
        return 0;
    }

    public String[] sortRGBColors(){
        //7. Arrange a list of RGB colors based on their overall brightness (R+G+B): ["#FF0000", "#00FF00", "#0000FF", "#FFFFFF", "#000000"]
       
        int arraySize = stringsArray.length;
        for(int i =1; i< arraySize; i++){
            String currentValue = stringsArray[i];
            int previousIndex = i-1;
            while(previousIndex>=0 && compareColors(stringsArray[previousIndex], currentValue) >0){
                stringsArray[previousIndex+1] = stringsArray[previousIndex];
                previousIndex--;
            }
            stringsArray[previousIndex+1] = currentValue;
        }
        return stringsArray;

    }

    public double compareColors(String color1, String color2) {
        HashMap<String, Integer> colorValues = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            colorValues.put(String.valueOf(i), i);
        }
        colorValues.put("A", 10);
        colorValues.put("B", 11);
        colorValues.put("C", 12);
        colorValues.put("D", 13);
        colorValues.put("E", 14);
        colorValues.put("F", 15);
    
        double brightness1 = calculateBrightness(color1, colorValues);
        double brightness2 = calculateBrightness(color2, colorValues);
    
        if(brightness1!=brightness2){
            return brightness1 - brightness2;
        }
        return 0;

    }
    
    private double calculateBrightness(String color, HashMap<String, Integer> colorValues) {
        if (color.length() != 6) {
            throw new IllegalArgumentException("Color must be a 6-character hex string");
        }
    
        int r = hexToDec(color.substring(0, 2), colorValues);
        int g = hexToDec(color.substring(2, 4), colorValues);
        int b = hexToDec(color.substring(4, 6), colorValues);
    
        return Math.sqrt(0.299 * r * r + 0.587 * g * g + 0.114 * b * b);
    }
    
    private int hexToDec(String hex, HashMap<String, Integer> colorValues) {
        return colorValues.get(hex.substring(0, 1)) * 16 + colorValues.get(hex.substring(1, 2));
    }





}
