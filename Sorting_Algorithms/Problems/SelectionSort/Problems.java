package Sorting_Algorithms.Problems.SelectionSort;

import java.util.HashMap;

public class Problems {

    public static int[] sortIntArray(int[] numList){
        int[] sortedList = numList.clone();
        int arraySize = sortedList.length;
        for(int i = 0; i < arraySize - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arraySize; j++){
                if(sortedList[minIndex] > sortedList[j]){
                    minIndex = j;
                }
            }
            int temp = sortedList[minIndex];
            sortedList[minIndex] = sortedList[i];
            sortedList[i] = temp;
        }
        return sortedList;
    }

    public static int[] unsortIntArray(int[] numList){
        int[] unsortedList = numList.clone();
        int arraySize = unsortedList.length;
        for(int i = 0; i < arraySize - 1; i++){
            int maxIndex = i;
            for(int j = i + 1; j < arraySize; j++){
                if(unsortedList[maxIndex] < unsortedList[j]){
                    maxIndex = j;
                }
            }
            int temp = unsortedList[maxIndex];
            unsortedList[maxIndex] = unsortedList[i];
            unsortedList[i] = temp;
        }
        return unsortedList;
    }

    public static String[] sortStrings(String[] stringList){
        String[] sortedList = stringList.clone();
        int arraySize = sortedList.length;
        for(int i = 0; i < arraySize - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arraySize; j++){
                if(compareWords(sortedList[minIndex], sortedList[j]) > 0){
                    minIndex = j;
                }
            }
            String temp = sortedList[minIndex];
            sortedList[minIndex] = sortedList[i];
            sortedList[i] = temp;
        }
        return sortedList;
    }

    public static int compareWords(String word1, String word2){
        int minLength = Math.min(word1.length(), word2.length());
        for(int i = 0; i < minLength; i++){
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            if(c1 != c2){
                return c1 - c2;
            }
        }
        return word1.length() - word2.length();
    }

    public static Student[] sortStudentGrades(Student[] studentList){
        Student[] sortedList = studentList.clone();
        int arraySize = sortedList.length;
        for(int i = 0; i < arraySize - 1; i++){
            int maxIndex = i;
            for(int j = i + 1; j < arraySize; j++){
                if(sortedList[maxIndex].getGradeAVG() < sortedList[j].getGradeAVG()){
                    maxIndex = j;
                }
            }
            Student temp = sortedList[maxIndex];
            sortedList[maxIndex] = sortedList[i];
            sortedList[i] = temp;
        }
        return sortedList;
    }

    public static String[] sortByNumberOfVowels(String[] stringList){
        String[] sortedList = stringList.clone();
        int arraySize = sortedList.length;
        for(int i = 0; i < arraySize - 1; i++){
            int maxIndex = i;
            for(int j = i + 1; j < arraySize; j++){
                if(countVowels(sortedList[maxIndex]) < countVowels(sortedList[j])){
                    maxIndex = j;
                }
            }
            String temp = sortedList[maxIndex];
            sortedList[maxIndex] = sortedList[i];
            sortedList[i] = temp;
        }
        return sortedList;
    }

    public static int countVowels(String word){
        int count = 0;
        String vowels = "aeiouyAEIOUY";
        for(int i = 0; i < word.length(); i++){
            if(vowels.indexOf(word.charAt(i)) != -1){
                count++;
            }
        }
        return count;
    }

    // Placeholder methods for sortAtoms and compareAtoms
    public static void sortAtoms(HashMap<String, Integer>[] atomList){
        // Implement sorting logic if needed
    }

    public static void compareAtoms(HashMap<String, Integer> atoms){
       for(String i: atoms.keySet()){
        System.out.println(i+ " = "+atoms.get(i));
       }
       
    }
}
