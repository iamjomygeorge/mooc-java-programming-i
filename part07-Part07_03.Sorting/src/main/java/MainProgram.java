import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        System.out.println("Smallest: " + smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
        System.out.println(Arrays.toString(array));
        swap(array, 1, 0);
        System.out.println(Arrays.toString(array));
        swap(array, 0, 3);
        System.out.println(Arrays.toString(array));
        sort(array);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i=0; i<array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        for (int i=0; i<array.length; i++) {
            if (array[i] == smallest) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallestIndex = startIndex;
        for (int i=startIndex + 1; i<array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int valueOfLeftIndex = array[index1];
        array[index1] = array[index2];
        array[index2] = valueOfLeftIndex;
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        int count = 0;
        while (count < array.length) {
            int indexOfSmallest = indexOfSmallestFrom(array, count);
            swap(array, indexOfSmallest, count);
            count ++;
        }
    }
}
