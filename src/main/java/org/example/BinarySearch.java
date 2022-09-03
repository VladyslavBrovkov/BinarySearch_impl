package org.example;

/**
 * Binary search implementation
 */

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
        System.out.println(binarySearch(array, 5));

    }

    public static int binarySearch(int[] array, int indexFound) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == indexFound) {
                return mid;
            }
            if (guess > indexFound) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

}
