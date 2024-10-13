package Sorting_Algorithms.Problems.SelectionSort;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        // Problem 1
        int[] unsortedNums = {1,6,4,3,2,7,9,8,5,4};
        int[] sortedArray = Problems.sortIntArray(unsortedNums);
        System.out.print("Sorted Array: ");
        for(int i : sortedArray){
            System.out.print(i + " ");
        }
        System.out.println();

        // Problem 2
        int[] unsortedArray = Problems.unsortIntArray(unsortedNums);
        System.out.print("Unsorted Array: ");
        for(int i : unsortedArray){
            System.out.print(i + " ");
        }
        System.out.println();

        // Problem 3
        String[] unsortedStrings = {"orange", "apple", "banana", "grape", "kiwi", "aaple"};
        String[] sortedStrings = Problems.sortStrings(unsortedStrings);
        System.out.print("Sorted Strings: ");
        for(String s : sortedStrings){
            System.out.print(s + " ");
        }
        System.out.println();

        // Problem 4
        int[] student1Grades = {99,99,100,97,98,86};
        Student student1 = new Student("Natalio", student1Grades);

        int[] student2Grades = {99,89,10,97,98,76};
        Student student2 = new Student("Kevin", student2Grades);

        Student[] studentList = {student1, student2};
        Student[] sortedStudentList = Problems.sortStudentGrades(studentList);
        System.out.println("Students Sorted by Average Grade:");
        for(Student s : sortedStudentList){
            System.out.println(s.getName() + " => " + s.getGradeAVG());
        }

        // Problem 5
        String[] unsortedWordsByVowelNumbers = {"rhythm", "symphony", "melody", "harmony", "tune", "abracadabra"};
        String[] sortedWordsByVowelNumbers = Problems.sortByNumberOfVowels(unsortedWordsByVowelNumbers);
        System.out.print("Words Sorted by Number of Vowels: ");
        for(String s : sortedWordsByVowelNumbers){
            System.out.print(s + " ");
        }
        System.out.println();

        // Problem 7 (Incomplete in original code)
        // You can implement sorting of atoms here if needed



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

    



