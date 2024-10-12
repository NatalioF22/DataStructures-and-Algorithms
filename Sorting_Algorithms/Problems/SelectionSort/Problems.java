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



}
