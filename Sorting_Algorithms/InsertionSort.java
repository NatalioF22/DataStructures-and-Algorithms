package Sorting_Algorithms;

public class InsertionSort {
    private int[] array;

    public InsertionSort(int[] array){
        this.array = array;
    }

    public int[] sort(){

        int length = array.length;

        for (int i = 1; i < length; i++) {

            int currentValue = array[i];

            int position = i - 1;
            
            while (position >= 0 && array[position] > currentValue) {
                array[position + 1] = array[position];
                position--;
            }
            array[position + 1] = currentValue;
        }
        return array;
    }

    public long analyzeTime(){
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        System.out.println("Insertion Sort Algorithm time: " + (endTime - startTime) + " nanoseconds.");
        return endTime - startTime;
    }
}
