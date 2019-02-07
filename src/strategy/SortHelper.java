package strategy;

import java.util.Random;

/*
 * 
 */
public class SortHelper {
  
  public static final int SECOND_ELEMENT_INDEX = 1;

  /**
   * Swaps two elements in array, given their indices.
   * 
   * @param arr The array
   * @param i The first index
   * @param j The second index
   */
  public static void swap(int[] arr, int i, int j) {
    try {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid indices for swapping!");
      e.printStackTrace();
    }
  }

  /**
   * Checks if a given array is sorted in ascending order.
   * 
   * @param arr The input array
   * @return true id the array is sorted
   * @throws ArrayElementException If the array is not sorted 
   */
  public static boolean checkIfSorted(int[] arr) throws ArrayElementException {
    for (int i = SECOND_ELEMENT_INDEX; i < arr.length; i++) {
      if (arr[i - 1] > arr[i]) {
        throw new ArrayElementException(arr, i - 1, i);
      }
    }
    return true;
  }

  /**
   * Creates an array to be sorted of length size, full of random elements, with
   * the maximum value of each element being equal to size.
   *
   * 
   * @param size The required size of the array
   * @return An array of length 'size', full of random elements
   * @throws InvalidSizeException If the size passed in is invalid
   */
  public static int[] createRandomArray(int size) throws InvalidSizeException {

    if (size <= 0) {
      throw new InvalidSizeException(0);
    } else {
      int[] array = new int[size];
      Random random = new Random();
      for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(size);
      }
      return array;
    }
  }
}
