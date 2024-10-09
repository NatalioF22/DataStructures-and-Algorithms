package Sorting_Algorithms.Problems.InsertionSort;

public class App {
    public static void main(String[] args) {
        System.out.println("Insertion Soorting Problems");
        int[] unsortedNums = {9,8,7,6,5,4,3,2,1,0};
        Problems problem1 = new Problems(unsortedNums);

    
        int[] sortedNums = problem1.sortedArrayInAscendentOrder();
        for(int i: sortedNums){
            System.out.print(i + " ");
        }
        System.out.println();

        Problems problem2 = new Problems(sortedNums);
        int[] unsrotedNums2 = problem2.sortedArrayInDescendentOrder();
        for(int i: unsrotedNums2){
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
