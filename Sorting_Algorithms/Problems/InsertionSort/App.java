package Sorting_Algorithms.Problems.InsertionSort;

public class App {
    public static void main(String[] args) {
        System.out.println("Insertion Soorting Problems");
        int[] unsortedNums = {9,8,7,6,5,4,3,2,1,0};
        char[] randomChars = {'r', 'Y', 'i', 't', 'B', 'P', 'c', 'u', 'q', 'n', 'd', 'O', 'f', 'a', 'H', 'G', 'j', 'R', 'x', 'm', 'I', 'S', 'v', 'g', 'N', 'b',
        'C', 'W', 'p', 'U', 'l', 'k', 'w', 'D', 'y', 'L', 'o', 'K', 'Q', 'A', 'F', 'M', 's', 'V', 'h', 'J', 'E', 'e', 'T', 'X', 'Z', 'z'};

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

        Problems problem3 = new Problems(randomChars);
        char[] sortedChars = problem3.sortArrayOfChars();
        for(char i: sortedChars){
            System.out.print(i+ " ");
        }
        System.out.println();

        String[] unsortedWords = {"Zulu","Alicio","Anastacia","hello", "world", "algorithm", "computer", "science"};
        Problems problem4 = new Problems(unsortedWords);
        String[] sortedWordsByLastChar = problem4.sortWordsByLastChar();

        for(String i: sortedWordsByLastChar){
            System.out.print(i+ " ");
        }
        System.out.println();

        int[] unsortedNums3 = {4, -2, 9, 1, -5, 6, 3, -8};
        Problems problem5 = new Problems(unsortedNums3);
        int[] sortedAbsNums = problem5.sortArrayByAbsoluteValue();
        for(int i: sortedAbsNums){
            System.out.print(i + " " );
        }
        System.out.println();
    
    
    }

   
    
}
