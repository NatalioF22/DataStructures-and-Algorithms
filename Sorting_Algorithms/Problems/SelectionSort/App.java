package Sorting_Algorithms.Problems.SelectionSort;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        int[] unsortedNums = {1,6,4,3,2,7,9,8,5,4};
        Problems problem1 = new Problems(unsortedNums);
        int[] sortedArray = problem1.sortIntArray();
        for(int i: sortedArray){
            System.out.print(i + " ");

        }
        System.out.println();



        //Problem 2
       
        Problems problem2 = new Problems(sortedArray);
        int[] unsortedArray = problem2.unsortIntArray();
        for(int i: unsortedArray){
            System.out.print(i + " ");

        }
        System.out.println();
    

     //Problem 3
    String[] unsortedStrings = {"orange", "apple", "banana", "grape", "kiwi", "aaple"};
     Problems problem3 = new Problems(unsortedStrings);
     String[] sortedStrings =  problem3.sortStrings();
     for(String i: sortedStrings){
        System.out.print(i+ " ");
     }
     System.out.println();

     //Problem 4
     int[] student1Grades = {99,99,100,97,98,86};
     Student student1 = new Student("Natalio",student1Grades );

     int[] student2Grades = {99,89,10,97,98,76};
     Student student2 = new Student("Kevin",student2Grades );

     Student[] studentlist = {student1, student2};

     Problems problem4 = new Problems();
     Student[] sortedStudentList = problem4.sortStudentGrades(studentlist);
     for(Student i: sortedStudentList){
        System.out.println(i.getName() + " => " + i.getGradeAVG());
     }

     String[] unsortedWordsByVowelNumbers = {"rhythm", "symphony", "melody", "harmony", "tune", "abracadabra"};
     Problems problem5 = new Problems(unsortedWordsByVowelNumbers);
     String[] sortedWordsByVowelNumbers = problem5.sortByNumberOfVowels();
     for(String i: sortedWordsByVowelNumbers){
        System.out.print(i + " ");
     }
     System.out.println();

     //This is for problem 7
    

    HashMap<String, Integer> shapeSides = new HashMap<>();
    shapeSides.put("triangle", 3);
    shapeSides.put("square", 4);
    shapeSides.put("pentagon", 5);
    shapeSides.put("hexagon", 6);
    shapeSides.put("heptagon", 7);
    shapeSides.put("octagon", 8);
    shapeSides.put("nonagon", 9);
    shapeSides.put("decagon", 10);
    shapeSides.put("hendecagon", 11);
    shapeSides.put("dodecagon", 12);
    shapeSides.put("triskaidecagon", 13);
    shapeSides.put("tetrakaidecagon", 14);
    shapeSides.put("circle", 0); 

    HashMap<String, Integer> atomicNumbers = new HashMap<>();
    atomicNumbers.put("Hydrogen", 1);
    atomicNumbers.put("Helium", 2);
    atomicNumbers.put("Lithium", 3);
    atomicNumbers.put("Beryllium", 4);
    atomicNumbers.put("Boron", 5);
    atomicNumbers.put("Carbon", 6);
    atomicNumbers.put("Nitrogen", 7);
    atomicNumbers.put("Oxygen", 8);
    atomicNumbers.put("Fluorine", 9);
    atomicNumbers.put("Neon", 10);
    atomicNumbers.put("Sodium", 11);
    atomicNumbers.put("Magnesium", 12);
    atomicNumbers.put("Aluminum", 13);
    atomicNumbers.put("Silicon", 14);
    atomicNumbers.put("Phosphorus", 15);
    atomicNumbers.put("Sulfur", 16);
    atomicNumbers.put("Chlorine", 17);
    atomicNumbers.put("Argon", 18);
    atomicNumbers.put("Potassium", 19);
    atomicNumbers.put("Calcium", 20);
    // Add more elements as needed




    
 }
    
}
