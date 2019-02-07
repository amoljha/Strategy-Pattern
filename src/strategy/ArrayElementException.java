package strategy;

@SuppressWarnings("serial")
public class ArrayElementException extends Exception {

  /**
   * An ArrayElementException is thrown when two subsequent elements are out of
   * order.
   * 
   * @param arr    The array in question
   * @param first  The first element's index in the array
   * @param second The second element's index in the array
   */
  public ArrayElementException(int[] arr, int first, int second) {
    String toPrintString = String.format("Elements out of order at index: %d and %d", first,
        second);
    toPrintString += String.format(" with values %d and %d respectively\n", arr[first],
        arr[second]);
    System.out.print(toPrintString);
  }
}
