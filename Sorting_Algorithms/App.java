package Sorting_Algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        // Use the array from the file for sorting instead of hardcoding it
        int[] numsFromFile = readTextFile();

        int sampleSize = 100;
        int[] sampleNums = new int[sampleSize];
        for (int i = 0; i < sampleSize; i++) {
            sampleNums[i] = (int) (Math.random() * 100) + 1;
        }

        if (numsFromFile == null) {
            System.out.println("Error reading the file.");
            return;
        }

        // Sort using BubbleSort
        BubbleSort bSort = new BubbleSort(sampleNums);
        int[] sortedArray = bSort.sort();
        

        // Sort using SelectionSort
        SelectionSort sSort = new SelectionSort(sampleNums); // Clone to avoid modifying original
        int[] sortedArray2 = sSort.sort();

        // Sort using SInsertionnSort
        InsertionSort iSort = new InsertionSort(sampleNums); // Clone to avoid modifying original
        int[] sortedArray3 = iSort.sort();
       
        System.out.println("BubbleSort Result: " + Arrays.toString(sortedArray));
        System.out.println("SelectionSort Result: " + Arrays.toString(sortedArray2));
        System.out.println("InsertionSort Result: " + Arrays.toString(sortedArray3));

         //Time Analysis
        System.out.println("BubbleSort Time: " + bSort.analyzeTime());
        System.out.println("SelectionSort Time: " + sSort.analyzeTime());
        System.out.println("InsertionSort Time: " + iSort.analyzeTime());




    }

    // Method to read numbers from a text file and return an int array
    public static int[] readTextFile() {
        List<Integer> numbersList = new ArrayList<>();

        try {
            File myObj = new File("Sorting_Algorithms/nums.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                // Split by space or comma if there are multiple numbers in one line
                String[] numberStrings = data.split("[ ,]+");

                for (String numStr : numberStrings) {
                    numbersList.add(Integer.parseInt(numStr));
                }
            }
            myReader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
            return null;
        }

        // Convert list to int array
        int[] numsArray = new int[numbersList.size()];
        for (int i = 0; i < numbersList.size(); i++) {
            numsArray[i] = numbersList.get(i);
        }

        return numsArray;
    }
}
