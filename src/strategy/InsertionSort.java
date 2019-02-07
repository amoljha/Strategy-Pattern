package strategy;

public class InsertionSort implements SortingMethod {

  @Override
  public int[] sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int j = i;
      while ((j > 0) && (arr[j] < arr[j - 1])) {
        SortHelper.swap(arr, j, j - 1);
        j--;
      }
    }
    return arr;
  }

}
