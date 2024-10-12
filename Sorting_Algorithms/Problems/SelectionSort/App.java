package Sorting_Algorithms.Problems.SelectionSort;

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



    
 }
    
}
