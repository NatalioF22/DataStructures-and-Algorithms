package Sorting_Algorithms.Problems.SelectionSort;

public class Problems {
    private int[] numList;
    private String[] stringList;
    public Problems(int[] nums){
        this.numList = nums;
    }

    public Problems(String[] strings){
        this.stringList = strings;
    }

  

    public Problems(){ }

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

    public String[] sortStrings(){
    //3. Sort an array of fruits alphabetically: ["orange", "apple", "banana", "grape", "kiwi"]
    int arraySize = stringList.length;
    for(int i =0;i< arraySize;i++){
        int minIndex = i;
        for(int j=i+1; j<arraySize;j++){
            if(compareWords(stringList[minIndex], stringList[j])>0){
                System.out.println(compareWords(stringList[minIndex], stringList[j]));
                minIndex = j;
            }
        }
        String temp = stringList[minIndex];
        stringList[minIndex] = stringList[i];
        stringList[i] = temp;
    }
    return stringList;


    }

    public int compareWords(String word1, String word2){
        int minLength = Math.min(word1.length(), word2.length());
        for(int i =0; i<minLength;i++){
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
           if(c1!=c2){
            return c1-c2;
           }
        }
       return 0;

    }

    public Student[] sortStudentGrades(Student[] studentList){
        int arraySize = studentList.length;
        for(int i = 0; i< arraySize;i++){
            int minIndex = i;
            for(int j=i+1; j<arraySize;j++){
                if(studentList[minIndex].getGradeAVG()<studentList[j].getGradeAVG()){
                    minIndex = j;
                }
            }
            Student temp = studentList[minIndex];
            studentList[minIndex] = studentList[i];
            studentList[i] = temp;
        }
        return studentList;
    }

    public String[] sortByNumberOfVowels(){
        int arraySize = stringList.length;
        for(int i=0; i< arraySize;i++){
            int minIndex = i;
            for(int j = i+1; j<arraySize;j++){
                if(countVowels(stringList[minIndex], stringList[j])<0){
                    minIndex = j;
                }
            }
            String temp = stringList[minIndex];
            stringList[minIndex] = stringList[i];
            stringList[i] = temp;
        }
        return stringList;
    }

    public int countVowels(String word1, String word2){
        char[] vowels = {'a','e','i','o','u','y'};
        int word1Vowels = 0;
        int word2Vowels = 0;
        for(int i=0;i<word1.length();i++){
            for(int j = 0; j< vowels.length;j++){
                if(word1.charAt(i) == vowels[j]){
                    word1Vowels+=1;
                }
              
            }
        }

        for(int i=0;i<word2.length();i++){
            for(int j = 0; j< vowels.length;j++){
                if(word2.charAt(i) == vowels[j]){
                    word2Vowels+=1;
                }
              
            }
        }
        return word1Vowels-word2Vowels;
        

    }



}
