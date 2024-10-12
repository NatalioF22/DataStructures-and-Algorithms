package Sorting_Algorithms.Problems.SelectionSort;

public class Student {
    private String name;
    private int[] grades;

    public Student(String name, int[] grades){
        this.name = name;
        this.grades = grades;
    }
    public String getName(){
        return this.name;
    }
    public double getGradeAVG(){
        int total = 0;
        for(int i: this.grades){
            total+=i;
        }
        return total/grades.length;
    }
    
}
